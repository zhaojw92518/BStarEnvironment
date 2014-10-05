package cn.edu.buaa.act.bstar.prover;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.global.CFileMgr;
import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.parser.preprocessor.CIncludeTreeNode;
import cn.edu.buaa.act.bstar.parser.preprocessor.CPreProcessor;
import cn.edu.buaa.act.bstar.quaternion.CQuaFactory;
import cn.edu.buaa.act.bstar.quaternion.CQuaTreeNode;

public class BStarProver {
	public static void test_01(){
		String input_file_addr = "bs/ProcessManagement.bs";
		CGlobalDef.init_font();
		CGlobalDef.start_debug_console();
		CQuaFactory.init_factory();
		CPreProcessor preprocessor = new CPreProcessor();
		File file = new File(input_file_addr);
		CFileMgr.set_base_dic(file);
		CIncludeTreeNode root_node = preprocessor.get_root_node(input_file_addr);
		root_node.extand_define_map();
		root_node.print_all_define_info();
		root_node.def_replace_all();
		CQuaTreeNode qua_root_node = root_node.generate_qua_tree();
		TreeMap<String, CQuaTreeNode> qua_node_map = CIncludeTreeNode.get_include_map();
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
		test_01();
	}

}
