package cn.edu.buaa.act.bstar.parser;

import java.util.TreeMap;

import org.antlr.v4.runtime.tree.ParseTree;

public class ProverNode {
	public String name = null;
	public ParseTree cv_define_tree = null, code_text_tree = null;
	public String cv_define_str = null, code_text_str = null;
	public TreeMap<String, ProverNode> include_map = new TreeMap<>();
	
	public ProverNode(String in_name){
		name = in_name;
	}
	
	public ProverNode(ParseTree in_cv_define, ParseTree in_code_tree){
		cv_define_tree = in_cv_define;
		code_text_tree = in_code_tree;
	}
	
	public void insert_node(String in_name, ProverNode in_node){
		include_map.put(in_name, in_node);
	}
}
