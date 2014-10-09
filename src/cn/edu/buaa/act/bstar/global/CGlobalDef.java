package cn.edu.buaa.act.bstar.global;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import cn.edu.buaa.act.bstar.global.CDebugConsole;;

public class CGlobalDef {
	public static final int 
			ERROR_INDEX = Integer.MIN_VALUE,
			NORMAL = Integer.MIN_VALUE + 1, 
			ERROR = Integer.MIN_VALUE + 2, 
			END = Integer.MIN_VALUE + 3;
	public static final String endl = System.getProperty("line.separator");
	public static final float global_font_size = 14f;
	
	private static CDebugConsole debug_console = null;
	
	public static void start_debug_console(){
		debug_console = new CDebugConsole();
	}
	
	public static void stop_debug_console(){
		debug_console = null;
	}
	
	public static void cout(String in_str){
		if(debug_console != null){
			debug_console.add_str(in_str);
		}
		else{
			System.out.print(in_str);
		}
	}
	
	public static void cout_end(String in_str){
		if(in_str == null){
			in_str = "null";
		}
		cout(in_str + endl);
	}
	
	public static void cout_end(int in_value){
		cout(CMath.int_to_str(in_value));
	}
	
	public static void cout_dividing_line(){
		cout_end("==============================================================================================================");
	}

	public static void info_box(String in_str){
		JOptionPane.showMessageDialog(null, in_str, "Error", JOptionPane.INFORMATION_MESSAGE);
		System.exit(1);
	}
	
	public static void set_ui_font (FontUIResource f){
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get (key);
			if (value != null && value instanceof javax.swing.plaf.FontUIResource){
				UIManager.put (key, f);
			}
		}
	}
	
	public static void init_font(){
		try {
			File font_file = new File("yahei_consolas.ttf");
			if(!font_file.exists() || !font_file.canRead()){
				info_box("Font(" + font_file.getAbsolutePath() + ") not exists!");
			}
			Font font = Font.createFont(Font.TRUETYPE_FONT, font_file).deriveFont(global_font_size);
			set_ui_font(new FontUIResource(font));
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
