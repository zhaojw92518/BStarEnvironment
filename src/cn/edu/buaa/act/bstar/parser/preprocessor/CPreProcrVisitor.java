package cn.edu.buaa.act.bstar.parser.preprocessor;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.parser.BStarBaseVisitor;
import cn.edu.buaa.act.bstar.parser.BStarParser;

public class CPreProcrVisitor extends BStarBaseVisitor<String>{
	public LinkedList<String> includes_list = new LinkedList<>();
	private LinkedHashMap<String, String> define_map = new LinkedHashMap<>();
	
	private int 	cv_define_start 	= -1, 
					cv_define_end 		= -1, 
					code_text_start 	= -1, 
					code_text_end 		= -1;
	
	private int code_text_start_line_num = -1;
	
	
	private String def_str_replace(String in_str){
		CStrReplacer cur_replacer = new CStrReplacer(in_str);
		String return_result = cur_replacer.str_replace(define_map);
		return return_result;
	}
	
	private String get_sub_str(int begin, int end, String in_str){
		try {
			String sub_str = in_str.substring(begin, end);
			return sub_str;
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public String get_cv_define_str(String entire_code_str){
		return get_sub_str(cv_define_start, cv_define_end, entire_code_str);
	}
	
	public String get_code_text_str(String entire_code_str){
		return get_sub_str(code_text_start, code_text_end, entire_code_str);
	}
	
	public int get_code_text_line_num(){
		return code_text_start_line_num;
	}
	
	public LinkedHashMap<String, String> get_define_map(){
		return define_map;
	}
	
	//For debug
	public void print_defines_map(){
		for(Map.Entry<String, String> cur_entry: define_map.entrySet()){
			CGlobalDef.cout_end(cur_entry.getKey() + " " + cur_entry.getValue());
		}
	}
	
	@Override public String visitAbmachine(@NotNull BStarParser.AbmachineContext ctx) {
		if(ctx.includes() != null){
			visitIncludes(ctx.includes());
		}
		if(ctx.defines() != null){
			visitDefines(ctx.defines());
		}
		if(ctx.cv_define() != null){
			cv_define_start = ctx.cv_define().start.getStartIndex();
			cv_define_end = ctx.cv_define().stop.getStopIndex() + 1;
		}
		if(ctx.code_text() != null){
			code_text_start_line_num = ctx.code_text().start.getLine();
			code_text_start = ctx.code_text().start.getStartIndex();
			code_text_end = ctx.code_text().stop.getStopIndex() + 1;
		}
		return null; 
	}
	
	@Override public String visitIncludes(@NotNull BStarParser.IncludesContext ctx) {
		for(int i = 0; i < ctx.string().size(); i++){
			String cur_str = ctx.string(i).getText();
			includes_list.add(cur_str.substring(1, cur_str.length() - 1));
		}
		for(int i = 0; i < ctx.id().size(); i++){
			includes_list.add(ctx.id(i).getText() + ".bs");
		}
		return null; 
	}
	
	@Override public String visitDefines(@NotNull BStarParser.DefinesContext ctx) {
		for(int i = 0; i < ctx.define().size(); i++){
			String 	key_str 	= ctx.id(i).getText(),
					value_str 	= ctx.element(i).getText(),
					true_value	= def_str_replace(value_str);
			define_map.put(key_str, true_value);
		}
		return null;
	}
	
}
