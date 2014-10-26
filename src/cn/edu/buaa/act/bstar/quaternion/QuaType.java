package cn.edu.buaa.act.bstar.quaternion;

public enum QuaType {
	INCLUDE,
	DEFINE,
	GLO_ATTR,
	GLO_ATTR_END,
	FUNC_ATTR,
	FUNC_ATTR_END,
	VAR_DEFINE,
	STRUCT_DEF,
	ENUM_DEF,
	TYPE_DEF,
	CST_DEFINE,
	
	FUNC_DECLARE,
	FUNC_DECLARE_END,
	FUNC_ROBUST_DECLARE,
	FUNC_ROBUST_DECLARE_END,
	
	LABEL,
	GOTO,
	IF_NOT,
	FUNC_DEFINE,
	FUNC_DEFINE_END,
	FUNC_PARA,
	RETURN,
	FUNC_CALL,
	
	LOOP,
	LOOP_END,
	
	ADDRESS_OF,
	CONTENT_OF,
	BASE_ADDRESS,
	
	MATH_ADD,
	MATH_SUB,
	MATH_MUL,
	MATH_DIV,
	MATH_MOD,
	MATH_REV,
	
	BOOL_NOT,
	
	CDT_LES,
	CDT_ELES,
	CDT_GRE,
	CDT_EGRE,
	CDT_NOT_BELONG,
	CDT_BELONG,
	CDT_EQU,
	CDT_UEQU,
	CDT_CONJ,
	CDT_DISJ,
	CDT_IMPL,
	
	
	
	SET_DIFFER,
	SET_INTER,
	SET_UNION,
	
	GET_ADDR,
	SET_ADDR,
	
	DEF_SEARCH_CDT,
	ADD_SEARCH,
	SET_SEARCH,
	SEARCH_ASSIGN,
	SEARCH_ASSIGN_NOT,
	
	ASSIGN_VALUE,
	ASSIGN_ADDR,
	BEGIN_CALL,
	CALL_PARA,
	GET_RETURN
	;
	
	
}
