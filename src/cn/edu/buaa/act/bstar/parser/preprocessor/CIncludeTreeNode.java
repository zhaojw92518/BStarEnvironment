package cn.edu.buaa.act.bstar.parser.preprocessor;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.parser.BStarLexer;
import cn.edu.buaa.act.bstar.parser.BStarParser;
import cn.edu.buaa.act.bstar.quaternion.CQuaGenerator;
import cn.edu.buaa.act.bstar.quaternion.CQuaTreeNode;
import cn.edu.buaa.act.bstar.quaternion.CQuaternion;

public class CIncludeTreeNode {
	private static TreeMap<String, CQuaTreeNode> include_map = new TreeMap<>();
	public static TreeMap<String, CQuaTreeNode> get_include_map(){
		return include_map;
	}
	
	private LinkedHashMap<String, String> define_map = null;
	private String cv_define_str = null, code_text_str = null, file_name = null;
	private LinkedList<CIncludeTreeNode> include_list = new LinkedList<>();
	private boolean is_extanded = false, is_replaced = false;
	
	public CIncludeTreeNode(
			String in_cv_define_str, 
			String in_code_text_str, 
			LinkedHashMap<String, String> in_define_map){
		cv_define_str = in_cv_define_str;
		code_text_str = in_code_text_str;
		define_map = in_define_map;
	}
	
	public void add_include_node(CIncludeTreeNode in_node){
		include_list.add(in_node);
	}
	
	public boolean is_leaf_node(){
		return include_list.isEmpty();
	}
	
	public void extand_define_map(){
		if(is_leaf_node()){
			is_extanded = true;
		}
		if(!is_extanded){
			LinkedHashMap<String, String> origin_map = define_map,
					dst_map = new LinkedHashMap<>();
			for(CIncludeTreeNode cur_node: include_list){
				cur_node.extand_define_map();
				for(Map.Entry<String, String> cur_entry: origin_map.entrySet()){
					CStrReplacer str_replacer = new CStrReplacer(cur_entry.getValue());
					String result_str = str_replacer.str_replace(cur_node.define_map);
					cur_entry.setValue(result_str);
				}
				dst_map.putAll(cur_node.define_map);
			}
			dst_map.putAll(origin_map);
			define_map = dst_map;
			is_extanded = true;
		}
	}
	
	private void def_replace(){
		if(cv_define_str != null){
			CStrReplacer cv_define_replacer = new CStrReplacer(cv_define_str);
			cv_define_str = cv_define_replacer.str_replace(define_map);
		}
		if(code_text_str != null){
			CStrReplacer code_text_replacer = new CStrReplacer(code_text_str);
			code_text_str = code_text_replacer.str_replace(define_map);
		}
		is_replaced = true;
	}
	
	public void def_replace_all(){
		def_replace();
		for(CIncludeTreeNode cur_node: include_list){
			if(!cur_node.is_replaced){
				cur_node.def_replace_all();
			}
		}
	}
	
	private BStarParser get_parser(String in_str){
		ANTLRInputStream input = new ANTLRInputStream(in_str);
		BStarLexer lexer = new BStarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	    BStarParser parser = new BStarParser(tokens);
	    return parser;
	}
	
	private LinkedList<CQuaternion> get_code_text_quas(){
		LinkedList<CQuaternion> return_result = null;
		if(code_text_str != null){
			CQuaGenerator qua_generator = new CQuaGenerator();
			BStarParser code_text_parser = get_parser(code_text_str);
			ParseTree tree = code_text_parser.code_text();
			CGlobalDef.cout_end(tree.toStringTree(code_text_parser));
			qua_generator.visit(tree);
			return_result = qua_generator.get_quas();
		}
		else{
			return_result = new LinkedList<>();
		}
		return return_result;
	}
	
	private LinkedList<CQuaternion> get_cv_define_quas(){
		LinkedList<CQuaternion> return_result = null;
		if(cv_define_str != null){
			CQuaGenerator qua_generator = new CQuaGenerator();
			BStarParser code_text_parser = get_parser(cv_define_str);
			qua_generator.visit(code_text_parser.cv_define());
			return_result = qua_generator.get_quas();
		}
		else{
			return_result = new LinkedList<>();
		}
		return return_result;
	}
	
	public CQuaTreeNode generate_qua_tree(){
		CQuaTreeNode return_result = null;
		return_result = include_map.get(file_name);
		if(return_result == null){
			return_result = new CQuaTreeNode(file_name);
			include_map.put(file_name, return_result);
			return_result.add_all_quas(get_cv_define_quas());
			return_result.add_all_quas(get_code_text_quas());
			for(CIncludeTreeNode cur_node: include_list){
				return_result.add_include_map(cur_node.file_name, cur_node.generate_qua_tree());
			}
		}
		return return_result;
	}
	
	//Debug
	public void set_file_name(String in_file_name){
		file_name = in_file_name;
	}
	
	public void print_all_define_info(){
		CGlobalDef.cout_end(file_name);
		CGlobalDef.cout_dividing_line();
		for(Map.Entry<String, String> cur_entry: define_map.entrySet()){
			CGlobalDef.cout_end(cur_entry.getKey() + "    " + cur_entry.getValue());
		}
		CGlobalDef.cout_dividing_line();
		for(CIncludeTreeNode cur_node: include_list){
			cur_node.print_all_define_info();
		}
	}
	//Debug End
}
