package cn.edu.buaa.act.bstar.quaternion;

import java.util.TreeMap;

import cn.edu.buaa.act.bstar.parser.BStarParser;

public class CQuaFactory {
	private static TreeMap<Integer, QuaType> token_to_qua = new TreeMap<>();
	
	public static void init_factory(){
		token_to_qua.put(BStarParser.ADD, QuaType.MATH_ADD);
		token_to_qua.put(BStarParser.SUB, QuaType.MATH_SUB);
		token_to_qua.put(BStarParser.MUL, QuaType.MATH_MUL);
		token_to_qua.put(BStarParser.DIV, QuaType.MATH_DIV);
		token_to_qua.put(BStarParser.MOD, QuaType.MATH_MOD);
		
		token_to_qua.put(BStarParser.NOT, 	QuaType.BOOL_NOT);
		token_to_qua.put(BStarParser.ADDR,	QuaType.ADDRESS_OF);
		
		token_to_qua.put(BStarParser.UNION, 	QuaType.SET_UNION);
		token_to_qua.put(BStarParser.INTER, 	QuaType.SET_INTER);
		token_to_qua.put(BStarParser.DIFFER, 	QuaType.SET_DIFFER);
		
		token_to_qua.put(BStarParser.L_ANGLE_BRACKET, 	QuaType.CDT_LES);
		token_to_qua.put(BStarParser.ELES, 				QuaType.CDT_ELES);
		token_to_qua.put(BStarParser.R_ANGLE_BRACKET, 	QuaType.CDT_GRE);
		token_to_qua.put(BStarParser.EGRE, 				QuaType.CDT_EGRE);
		token_to_qua.put(BStarParser.NOTBELONG, 		QuaType.CDT_NOT_BELONG);
		token_to_qua.put(BStarParser.BELONG, 			QuaType.CDT_BELONG);
		token_to_qua.put(BStarParser.EQU, 				QuaType.CDT_EQU);
		token_to_qua.put(BStarParser.UEQU, 				QuaType.CDT_UEQU);
	}
	
	public static CQuaternion create_qua(int in_type, CQuaData in_data_0, CQuaData in_data_1, CQuaData in_data_2, int in_line_num){
		return create_qua(token_to_qua.get(new Integer(in_type)), in_data_0, in_data_1, in_data_2, in_line_num);
	}
	
	public static CQuaternion create_qua(int in_type, CQuaData in_data_0, CQuaData in_data_1, int in_line_num){
		return create_qua(token_to_qua.get(new Integer(in_type)), in_data_0, in_data_1, in_line_num);
	}
	
	public static CQuaternion create_qua(QuaType in_type, int in_line_num){
		CQuaternion return_result = new CQuaternion();
		return_result.type = in_type;
		return_result.line_num = in_line_num;
		return return_result;
	}
	
	public static CQuaternion create_qua(QuaType in_type, CQuaData in_data_0, int in_line_num){
		CQuaternion return_result = new CQuaternion();
		return_result.type = in_type;
		return_result.data_0 = in_data_0;
		return_result.line_num = in_line_num;
		return return_result;
	}
	
	public static CQuaternion create_qua(QuaType in_type, CQuaData in_data_0, CQuaData in_data_1, int in_line_num){
		CQuaternion return_result = new CQuaternion();
		return_result.type = in_type;
		return_result.data_0 = in_data_0;
		return_result.data_1 = in_data_1;
		return_result.line_num = in_line_num;
		return return_result;
	}
	
	public static CQuaternion create_qua(QuaType in_type, CQuaData in_data_0, CQuaData in_data_1, CQuaData in_data_2, int in_line_num){
		CQuaternion return_result = new CQuaternion();
		return_result.type = in_type;
		return_result.data_0 = in_data_0;
		return_result.data_1 = in_data_1;
		return_result.data_2 = in_data_2;
		return_result.line_num = in_line_num;
		return return_result;
	}
}
