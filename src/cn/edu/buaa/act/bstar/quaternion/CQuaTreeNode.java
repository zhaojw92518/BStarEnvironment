package cn.edu.buaa.act.bstar.quaternion;

import java.util.LinkedList;
import java.util.TreeMap;

import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class CQuaTreeNode {
	private String file_name = null;
	private LinkedList<CQuaternion> quas = new LinkedList<>();
	private TreeMap<String, CQuaTreeNode> include_map = new TreeMap<>();
	
	public CQuaTreeNode(String in_file_name){
		file_name = in_file_name;
	}
	
	public void add_all_quas(LinkedList<CQuaternion> in_quas){
		quas.addAll(in_quas);
	}
	
	public void add_include_map(String in_name, CQuaTreeNode in_node){
		include_map.put(in_name, in_node);
	}
	
	public void print_quas(){
		CGlobalDef.cout_end(file_name);
		CGlobalDef.cout_dividing_line();
		for(int i = 0; i < quas.size(); i++){
			CGlobalDef.cout(i + "\t" + quas.get(i).to_table_str());
		}
		CGlobalDef.cout_dividing_line();
	}
	
	public LinkedList<CQuaternion> get_quas(){
		return quas;
	}
	
	public TreeMap<String, CQuaTreeNode> get_include_map(){
		return include_map;
	}
	
	public String get_file_name(){
		return file_name;
	}
}
