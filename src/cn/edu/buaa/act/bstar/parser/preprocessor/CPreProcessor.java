package cn.edu.buaa.act.bstar.parser.preprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import cn.edu.buaa.act.bstar.global.CFileMgr;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.parser.BStarLexer;
import cn.edu.buaa.act.bstar.parser.BStarParser;

public class CPreProcessor {
	private String root_file_name = null;
	private TreeMap<String, CIncludeTreeNode> include_map = new TreeMap<>();
	private CIncludeTreeNode root_node = null;
	
	private String get_file_str(File in_file) throws IOException{
		String return_result = null;
		if(in_file.exists() && in_file.canRead()){
			StringBuffer fileData = new StringBuffer();
	        BufferedReader reader = new BufferedReader(new FileReader(in_file));
	        char[] buf = new char[1024];
	        int numRead = 0;
	        while((numRead = reader.read(buf)) != -1){
	            String readData = String.valueOf(buf, 0, numRead);
	            fileData.append(readData);
	        }
	        reader.close();
	        return_result = fileData.toString();
		}
		else{
			CGlobalDef.cout_end(in_file.getAbsolutePath() + " can't be found or read!");
		}
        return return_result;
	}
	
	private ParseTree get_parse_tree(String in_str){
		ParseTree return_result = null;
		if(in_str != null){
			ANTLRInputStream input = new ANTLRInputStream(in_str);
			BStarLexer lexer = new BStarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
		    BStarParser parser = new BStarParser(tokens);
		    return_result = parser.abmachine();
		}
		return return_result;
	}
	
	private CIncludeTreeNode include_file(File in_file) throws IOException{
		String code_str = get_file_str(in_file);
		ParseTree parse_tree = get_parse_tree(code_str);
		CIncludeTreeNode return_result = null;
		if(parse_tree != null){
			CIncludeTreeNode cur_node = include_map.get(in_file.getCanonicalPath());
			if(cur_node != null){
				return_result = cur_node;
			}
			else{
				CGlobalDef.cout_end("Included " + in_file.getCanonicalPath());
				CPreProcrVisitor visitor = new CPreProcrVisitor();
				visitor.visit(parse_tree);
				cur_node = new CIncludeTreeNode(
						visitor.get_cv_define_str(code_str), 
						visitor.get_code_text_str(code_str),
						visitor.get_define_map());
				cur_node.set_code_text_start_line_num(visitor.get_code_text_line_num());
				cur_node.set_file_name(in_file.getCanonicalPath());
				include_map.put(in_file.getCanonicalPath(), cur_node);
				for(String cur_str: visitor.includes_list){
					CIncludeTreeNode list_node = include_file(new File(CFileMgr.get_base_dic() + cur_str));
					cur_node.add_include_node(list_node);
				}
				return_result = cur_node;
			}
		}
		return return_result;
	}
	
	public CIncludeTreeNode get_root_node(String in_str){
		CIncludeTreeNode return_result = null;
		try {
			File root_file = new File(in_str);
			root_file_name = root_file.getCanonicalPath();
			return_result = include_file(root_file);
		} catch (IOException e) {
			System.err.println(e.toString());
		}
		return return_result;
	}
	
	
}
