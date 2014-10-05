package cn.edu.buaa.act.bstar.parser;
// Generated from .\BStar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BStarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BStarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BStarParser#one_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_e(@NotNull BStarParser.One_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull BStarParser.Function_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#quan_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuan_e(@NotNull BStarParser.Quan_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#imp_pro_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp_pro_e(@NotNull BStarParser.Imp_pro_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#append_paras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_paras(@NotNull BStarParser.Append_parasContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull BStarParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull BStarParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#pro_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPro_e(@NotNull BStarParser.Pro_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#defines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefines(@NotNull BStarParser.DefinesContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(@NotNull BStarParser.NilContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#mse_1_latter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMse_1_latter(@NotNull BStarParser.Mse_1_latterContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#cv_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCv_define(@NotNull BStarParser.Cv_defineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#declares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclares(@NotNull BStarParser.DeclaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(@NotNull BStarParser.While_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull BStarParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#not_belong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_belong(@NotNull BStarParser.Not_belongContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull BStarParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#term_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_set(@NotNull BStarParser.Term_setContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull BStarParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#attributes_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes_2(@NotNull BStarParser.Attributes_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#assign_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stat(@NotNull BStarParser.Assign_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#break_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stat(@NotNull BStarParser.Break_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#false_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_str(@NotNull BStarParser.False_strContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#condition_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_term(@NotNull BStarParser.Condition_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#set_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_type(@NotNull BStarParser.Set_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(@NotNull BStarParser.IncludesContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull BStarParser.RealContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#para_define_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_define_list(@NotNull BStarParser.Para_define_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant(@NotNull BStarParser.InvariantContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#else_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stat(@NotNull BStarParser.Else_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#unary_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_e(@NotNull BStarParser.Unary_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#at_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_str(@NotNull BStarParser.At_strContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#var_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_define(@NotNull BStarParser.Var_defineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(@NotNull BStarParser.Struct_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#com_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom_statement(@NotNull BStarParser.Com_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#addr_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddr_id(@NotNull BStarParser.Addr_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#para_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_value_list(@NotNull BStarParser.Para_value_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#element_take}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_take(@NotNull BStarParser.Element_takeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#mse_latter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMse_latter(@NotNull BStarParser.Mse_latterContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#pro_term_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPro_term_e(@NotNull BStarParser.Pro_term_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(@NotNull BStarParser.Id_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#belong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelong(@NotNull BStarParser.BelongContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#statement_at}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_at(@NotNull BStarParser.Statement_atContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull BStarParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#mse_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMse_1(@NotNull BStarParser.Mse_1Context ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#mse_0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMse_0(@NotNull BStarParser.Mse_0Context ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#function_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_define(@NotNull BStarParser.Function_defineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(@NotNull BStarParser.PointContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#addr_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddr_get(@NotNull BStarParser.Addr_getContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#or_pro_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_pro_e(@NotNull BStarParser.Or_pro_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(@NotNull BStarParser.OperationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#enum_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_type(@NotNull BStarParser.Enum_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#abmachine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbmachine(@NotNull BStarParser.AbmachineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#cst_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCst_define(@NotNull BStarParser.Cst_defineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull BStarParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(@NotNull BStarParser.DefineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#condition_term_latter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_term_latter(@NotNull BStarParser.Condition_term_latterContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull BStarParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull BStarParser.If_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#single_cv_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_cv_define(@NotNull BStarParser.Single_cv_defineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#char_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_str(@NotNull BStarParser.Char_strContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(@NotNull BStarParser.IncludeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#point_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint_id(@NotNull BStarParser.Point_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#single_enum_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_enum_type(@NotNull BStarParser.Single_enum_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#robust}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobust(@NotNull BStarParser.RobustContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#single_var_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_var_define(@NotNull BStarParser.Single_var_defineContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#term_latter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_latter(@NotNull BStarParser.Term_latterContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(@NotNull BStarParser.Return_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#function_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declare(@NotNull BStarParser.Function_declareContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#code_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_text(@NotNull BStarParser.Code_textContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#declare_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_operations(@NotNull BStarParser.Declare_operationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#cdeclare_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdeclare_operations(@NotNull BStarParser.Cdeclare_operationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#true_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_str(@NotNull BStarParser.True_strContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#and_pro_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_pro_e(@NotNull BStarParser.And_pro_eContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#term_element_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_element_comma(@NotNull BStarParser.Term_element_commaContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#continue_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stat(@NotNull BStarParser.Continue_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(@NotNull BStarParser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#normal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_type(@NotNull BStarParser.Normal_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#belong_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelong_pair(@NotNull BStarParser.Belong_pairContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#cfunction_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCfunction_declare(@NotNull BStarParser.Cfunction_declareContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#mse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMse(@NotNull BStarParser.MseContext ctx);

	/**
	 * Visit a parse tree produced by {@link BStarParser#term_tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_tuple(@NotNull BStarParser.Term_tupleContext ctx);
}