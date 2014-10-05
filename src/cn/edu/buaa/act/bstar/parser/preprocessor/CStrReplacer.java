package cn.edu.buaa.act.bstar.parser.preprocessor;

import java.util.LinkedHashMap;

public class CStrReplacer {
	private int cur_begin = -1, cur_end = -1, str_length = 0;;
	private StringBuffer str_buffer = new StringBuffer();
	private String origin_str = null;
	
	public CStrReplacer(String in_str){
		origin_str = in_str;
		cur_begin = 0;
		cur_end = 0;
		str_length = origin_str.length();
	}
	
	private boolean is_word_char(char in_char){
		return Character.isLetterOrDigit(in_char) || 
			in_char == '_';
	}
	
	private boolean find_next_word(){
		boolean return_result = false;
		if(cur_end < str_length){
			for(int i = cur_end; i < str_length; i++){
				char cur_char = origin_str.charAt(i);
				if(is_word_char(cur_char)){
					cur_begin = i;
					return_result = true;
					break;
				}
				else{
					str_buffer.append(cur_char);
					cur_end++;
				}
			}
			for(cur_end = cur_begin + 1; cur_end < str_length; cur_end++){
				char cur_char = origin_str.charAt(cur_end);
				if(!is_word_char(cur_char)){
					break;
				}
			}
		}
		return return_result;
	}
	
	public String str_replace(LinkedHashMap<String, String> def_map){
		String return_result = null;
		if(!def_map.isEmpty()){
			while(true){
				if(find_next_word()){
					String cur_word = origin_str.substring(cur_begin, cur_end),
							replace_word = def_map.get(cur_word);
					if(replace_word != null){
						str_buffer.append(replace_word);
					}
					else{
						str_buffer.append(cur_word);
					}
				}
				else{
					break;
				}
			}
			return_result = str_buffer.toString();
		}
		else{
			return_result = origin_str;
		}
		return return_result;
	}
}
