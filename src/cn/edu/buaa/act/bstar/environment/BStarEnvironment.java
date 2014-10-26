package cn.edu.buaa.act.bstar.environment;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.global.CFileMgr;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.parser.preprocessor.CIncludeTreeNode;
import cn.edu.buaa.act.bstar.parser.preprocessor.CPreProcessor;
import cn.edu.buaa.act.bstar.quaternion.CQuaFactory;
import cn.edu.buaa.act.bstar.quaternion.CQuaTreeNode;

public class BStarEnvironment {
	private String file_addr = null;
	private CQuaTreeNode qua_tree_root = null;
	private TreeMap<String, CQuaTreeNode> qua_node_list = null;
	private boolean is_start_debug_console = true;
	private int start_line_num = -1;
	
	public BStarEnvironment(String in_file_addr){
		file_addr = in_file_addr;
	}
	
	public CQuaTreeNode get_qua_tree_root(){
		return qua_tree_root;
	}
	
	public TreeMap<String, CQuaTreeNode> get_qua_node_list(){
		return qua_node_list;
	}
	
	public void start_debug_console(){
		is_start_debug_console = true;
	}
	
	public void stop_debug_console(){
		is_start_debug_console = false;
	}
	
	public void generate_environment(){
		if(is_start_debug_console){
			CGlobalDef.init_font();
			CGlobalDef.start_debug_console();
		}
		CQuaFactory.init_factory();
		CPreProcessor preprocessor = new CPreProcessor();
		File file = new File(file_addr);
		CFileMgr.set_base_dic(file);
		CIncludeTreeNode root_node = preprocessor.get_root_node(file_addr);
		root_node.extand_define_map();
		root_node.print_all_define_info();
		root_node.def_replace_all();
		qua_tree_root = root_node.generate_qua_tree();
		qua_node_list = CIncludeTreeNode.get_include_map();
		/*for(Map.Entry<String, CQuaTreeNode> cur_entry: qua_node_map.entrySet()){
			cur_entry.getValue().print_quas();
		}*/
	}
	
	public static void test_01(String in_file_addr){
		//String input_file_addr = "bs/Test01.bs";
		BStarEnvironment cur_evt = new BStarEnvironment(in_file_addr);
		cur_evt.start_debug_console();
		cur_evt.generate_environment();
		CQuaTreeNode qua_root_node = cur_evt.get_qua_tree_root();
		TreeMap<String, CQuaTreeNode> qua_node_map = cur_evt.get_qua_node_list();
		for(Map.Entry<String, CQuaTreeNode> cur_entry: qua_node_map.entrySet()){
			cur_entry.getValue().print_quas();
		}
		//try {
			
			/*CQuaGenerator qua_generator = new CQuaGenerator();
			for(Map.Entry<String, CPreProcResult> cur_entry: preprocessor.get_results().entrySet()){
				ANTLRInputStream input = new ANTLRInputStream(cur_entry.getValue().cv_define_str);
				BStarLexer lexer = new BStarLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
			    BStarParser parser = new BStarParser(tokens);
			    qua_generator.visit(parser.cv_define());
			    qua_generator.print_quas();
			    qua_generator.init();
			    
			    String temp_str = cur_entry.getValue().code_text_str;
			    if(temp_str != null){
			    	input = new ANTLRInputStream(temp_str);
					lexer = new BStarLexer(input);
					tokens = new CommonTokenStream(lexer);
				    parser = new BStarParser(tokens);
				    ParseTree code_text_tree = parser.code_text();
				    qua_generator.visit(code_text_tree);
				    qua_generator.print_quas();
			    }
			}*/
		//} 
	}
	
	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("You need to input one more argument.");
		}
		else{
			test_01(args[0]);
		}
	}
}
