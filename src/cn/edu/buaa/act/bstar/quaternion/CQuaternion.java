package cn.edu.buaa.act.bstar.quaternion;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.global.CMath;

public class CQuaternion{
	public QuaType type = null;
	public CQuaData data_0 = null, data_1 = null, data_2 = null;
	public int line_num = -1;
	
	public CQuaternion(){
		
	}
	
	public QuaType get_type(){
		return type;
	}
	
	public String toString(){
		return type + " " + data_0 + " " + data_1 + " " + data_2;
	}
	
	private String get_single_table_str(String in_str){
		String return_result = null;
		//打表表格宽度
		int table_width = 20;
		if(in_str.length() > table_width){
			return_result = in_str.substring(0, table_width);
		}
		else{
			return_result = in_str;
			return_result += blank_str.substring(0, table_width - in_str.length());
		}
		return return_result;
	}
	
	private static final String blank_str = "                    ";
	private String get_data_str(CQuaData in_data){
		if(in_data == null){
			return blank_str;
		}
		else{
			return get_single_table_str(in_data.toString());
		}
	}
	
	public String to_table_str(){
		StringBuffer return_result = new StringBuffer();
		return_result.append("|");
		return_result.append(get_single_table_str(type.toString()));
		return_result.append("|");
		if(type == QuaType.ENUM_DEF || type == QuaType.STRUCT_DEF){
			return_result.append(get_data_str(data_0.list_data.getFirst()));
			return_result.append("|");
			return_result.append(get_data_str(data_1.list_data.getFirst()));
			return_result.append("|");
			return_result.append(get_data_str(data_2));
			return_result.append("|");
			return_result.append(get_single_table_str(CMath.int_to_str(line_num)));
			return_result.append("|");
			return_result.append(CGlobalDef.endl);
			String empty_str = new String();
			for(int i = 1; i < data_0.list_data.size(); i++){
				return_result.append("\t");
				return_result.append("|");
				return_result.append(get_single_table_str(empty_str));
				return_result.append("|");
				return_result.append(get_data_str(data_0.list_data.get(i)));
				return_result.append("|");
				return_result.append(get_data_str(data_1.list_data.get(i)));
				return_result.append("|");
				return_result.append(get_single_table_str(empty_str));
				return_result.append("|");
				return_result.append(CGlobalDef.endl);
			}
		}
		else{
			return_result.append(get_data_str(data_0));
			return_result.append("|");
			return_result.append(get_data_str(data_1));
			return_result.append("|");
			return_result.append(get_data_str(data_2));
			return_result.append("|");
			return_result.append(get_single_table_str(CMath.int_to_str(line_num)));
			return_result.append("|");
			return_result.append(CGlobalDef.endl);
		}
		return return_result.toString();
	}
}
