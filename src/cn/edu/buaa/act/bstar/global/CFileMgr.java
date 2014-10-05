package cn.edu.buaa.act.bstar.global;

import java.io.File;
import java.io.IOException;

public class CFileMgr {
	private static String base_dic_str = null;
	public static void set_base_dic(File in_file){
		try {
			base_dic_str = in_file.getParentFile().getCanonicalPath() + "\\";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get_base_dic(){
		return base_dic_str;
	}
}
