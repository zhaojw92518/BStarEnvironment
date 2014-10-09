package cn.edu.buaa.act.bstar.quaternion;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;

import cn.edu.buaa.act.bstar.global.CGlobalDef;
import cn.edu.buaa.act.bstar.global.CMath;
import cn.edu.buaa.act.bstar.parser.BStarBaseVisitor;
import cn.edu.buaa.act.bstar.parser.BStarParser;

public class CQuaGenerator extends BStarBaseVisitor<CQuaData>{
	private Integer temp_count = new Integer(0),
					label_count = new Integer(0);
	private LinkedList<CQuaternion> quas = new LinkedList<>();
	private Stack<CQuaData> start_stack = new Stack<>(),
							end_stack = new Stack<>();
	private void add_qua(CQuaternion in_qua){
		quas.add(in_qua);
	}
	
	private void reset_temp_count(){
		temp_count = 0;
	}
	
	private void push_start(CQuaData in_start_label){
		start_stack.push(in_start_label);
	}
	
	private void push_end(CQuaData in_end_label){
		end_stack.push(in_end_label);
	}
	
	private void pop_start(){
		start_stack.pop();
	}
	
	private void pop_end(){
		end_stack.pop();
	}
	
	private CQuaData get_cur_start(){
		CQuaData return_result = null;
		if(!start_stack.isEmpty()){
			return_result = new CQuaData(start_stack.lastElement());
		}
		return return_result;
	}
	
	private CQuaData get_cur_end(){
		CQuaData return_result = null;
		if(!end_stack.isEmpty()){
			return_result = new CQuaData(end_stack.lastElement());
		}
		return return_result;
	}
	
	private CQuaData get_temp_id(){
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.ID;
		return_result.str_data_0 = "@" + temp_count.toString();
		++temp_count;
		return return_result;
	}
	
	private CQuaData get_label_id(){
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.INT;
		return_result.value_data = label_count.doubleValue();
		++label_count;
		return return_result;
	}
	
	public void init(){
		quas.clear();
	}
	
	public LinkedList<CQuaternion> get_quas(){
		return quas;
	}
	
	//Debug
	public void print_quas(){
		for(Integer i = 0; i < quas.size(); ++i){
			CGlobalDef.cout(i.toString() + "\t" + quas.get(i).to_table_str());
		}
	}
	
	//Debug end
	
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitBelong(@NotNull BStarParser.BelongContext ctx) { return visitChildren(ctx); }

	@Override public CQuaData visitCode_text(@NotNull BStarParser.Code_textContext ctx) { 
		if(ctx.operations() != null){
			visitOperations(ctx.operations());
		}
		else if(ctx.declare_operations() != null){
			visitDeclare_operations(ctx.declare_operations());
		}
		else if(ctx.cdeclare_operations() != null){
			visitCdeclare_operations(ctx.cdeclare_operations());
		}
		return null; 
	}

	@Override public CQuaData visitType(@NotNull BStarParser.TypeContext ctx) {
		CQuaData return_result = null;
		if(ctx.normal_type() != null){
			return_result = visitNormal_type(ctx.normal_type());
		}
		else if(ctx.set_type() != null){
			return_result = visitSet_type(ctx.set_type());
		}
		else if(ctx.id() != null){
			//TODO 不知道尖括号是什么
			if(ctx.type() != null){
				
			}
			else{
				return_result = new CQuaData();
				return_result.type = QuaDataType.TYPE;
				return_result.str_data_0 = ctx.id().getText();
			}
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAnd_pro_e(@NotNull BStarParser.And_pro_eContext ctx) { 
		CQuaData return_result = visitPro_term_e(ctx.pro_term_e(0));
		if(ctx.pro_term_e().size() > 1){
			CQuaData first_data = return_result;
			return_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.CDT_CONJ, 
					first_data, 
					visitPro_term_e(ctx.pro_term_e(1)),
					return_result,
					ctx.pro_term_e(1).start.getLine()));
			for(int i = 2; i < ctx.pro_term_e().size(); i++){
				add_qua(CQuaFactory.create_qua(
						QuaType.CDT_CONJ, 
						return_result, 
						visitPro_term_e(ctx.pro_term_e(i)),
						return_result,
						ctx.pro_term_e(i).start.getLine()));
			}
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction(@NotNull BStarParser.FunctionContext ctx) { 
		
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPara_define_list(@NotNull BStarParser.Para_define_listContext ctx) { 
		if(ctx.point_id() != null){
			for(int i = 0; i < ctx.point_id().size(); ++i){
				CQuaData cur_id = visitPoint_id(ctx.point_id(i)),
						 cur_type = visitType(ctx.type(i));
				
				cur_type.value_data = cur_id.value_data;
				cur_id.value_data = 0.0;
				add_qua(CQuaFactory.create_qua(
						QuaType.FUNC_PARA, 
						cur_id,
						cur_type,
						ctx.point_id(i).start.getLine()
						));
			}
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitInvariant(@NotNull BStarParser.InvariantContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitQuan_e(@NotNull BStarParser.Quan_eContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAbmachine(@NotNull BStarParser.AbmachineContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override public CQuaData visitCom_statement(@NotNull BStarParser.Com_statementContext ctx) { 
		if(ctx.attributes_2() != null){
			visitAttributes_2(ctx.attributes_2());
		}
		if(ctx.invariant() != null){
			visitInvariant(ctx.invariant());
		}
		if(ctx.statement() != null){
			for(BStarParser.StatementContext cur_state: ctx.statement()){
				visitStatement(cur_state);
			}
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitChar_str(@NotNull BStarParser.Char_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitElement(@NotNull BStarParser.ElementContext ctx) { 
		return visitPro_e(ctx.pro_e()); 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitEnum_type(@NotNull BStarParser.Enum_typeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPro_e(@NotNull BStarParser.Pro_eContext ctx) {
		CQuaData return_result = visitOr_pro_e(ctx.or_pro_e(0));
		if(ctx.or_pro_e().size() > 1){
			CQuaData first_data = return_result;
			return_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.CDT_IMPL, 
					first_data, 
					visitOr_pro_e(ctx.or_pro_e(1)),
					return_result,
					ctx.or_pro_e(1).start.getLine()));
			for(int i = 2; i < ctx.or_pro_e().size(); i++){
				add_qua(CQuaFactory.create_qua(
						QuaType.CDT_IMPL, 
						return_result, 
						visitOr_pro_e(ctx.or_pro_e(i)),
						return_result,
						ctx.or_pro_e(i).start.getLine()));
			}
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCondition_term(@NotNull BStarParser.Condition_termContext ctx) { 
		CQuaData return_result = visitMse(ctx.mse());
		BStarParser.Condition_term_latterContext cur_latter = ctx.condition_term_latter();
		if(cur_latter != null){
			if(cur_latter.start.getType() == BStarParser.BELONG){
				return_result = null;
			}
			else{
				CQuaData condition_result = get_temp_id();
				add_qua(CQuaFactory.create_qua(
						cur_latter.start.getType(), 
						return_result, 
						visitMse(cur_latter.mse()), 
						condition_result,
						cur_latter.start.getLine()));
				return_result = condition_result;
			}
		}
		else{
			
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCst_define(@NotNull BStarParser.Cst_defineContext ctx) { 
		CQuaData cur_type = visitType(ctx.type());
		for(int i = 0; i < ctx.point_id().size(); ++i){
			CQuaData cur_id = visitPoint_id(ctx.point_id(i)),
					 temp_type = new CQuaData(cur_type);
			temp_type.value_data = cur_id.value_data;
			cur_id.value_data = 0.0;
			CQuaData element_result = visitElement(ctx.element(i));
			add_qua(
				CQuaFactory.create_qua(
						QuaType.CST_DEFINE, 
						cur_id, 
						temp_type, 
						element_result,
						ctx.point_id(i).start.getLine()
						)
				);
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction_define(@NotNull BStarParser.Function_defineContext ctx) { 
		reset_temp_count();
		add_qua(CQuaFactory.create_qua(
				QuaType.FUNC_DEFINE, 
				visitPoint_id(ctx.point_id()), 
				visitType(ctx.type()),
				ctx.point_id().start.getLine()));
		visitPara_define_list(ctx.para_define_list());
		visitCom_statement(ctx.com_statement());
		add_qua(CQuaFactory.create_qua(QuaType.FUNC_DEFINE_END, -1));
		return null; 
	}

	@Override public CQuaData visitOne_e(@NotNull BStarParser.One_eContext ctx) { 
		CQuaData return_result = null;
		if(ctx.term() != null){
			return_result = visitTerm(ctx.term());
		}
		else if(ctx.start.getType() == BStarParser.MUL){
			//防止乘法运算与指针取值的冲突
			return_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.CONTENT_OF, 
					visitOne_e(ctx.one_e()), 
					return_result,
					ctx.start.getLine()));
		}
		else{
			return_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					ctx.start.getType(), 
					visitOne_e(ctx.one_e()), 
					return_result,
					ctx.start.getLine()));
		}
		return return_result; 
	}

	@Override public CQuaData visitId_list(@NotNull BStarParser.Id_listContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitInclude(@NotNull BStarParser.IncludeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitStatement(@NotNull BStarParser.StatementContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDefines(@NotNull BStarParser.DefinesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAddr_get(@NotNull BStarParser.Addr_getContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitStruct_type(@NotNull BStarParser.Struct_typeContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction_call(@NotNull BStarParser.Function_callContext ctx) { 
		visitPara_value_list(ctx.para_value_list());
		add_qua(CQuaFactory.create_qua(QuaType.FUNC_CALL, visitId(ctx.id()), ctx.id().start.getLine()));
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAppend_paras(@NotNull BStarParser.Append_parasContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitSet_type(@NotNull BStarParser.Set_typeContext ctx) { 
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.TYPE;
		return_result.str_data_0 = "set";
		return_result.templet_type = visitType(ctx.type());
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCdeclare_operations(@NotNull BStarParser.Cdeclare_operationsContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitWhile_stat(@NotNull BStarParser.While_statContext ctx) { 
		CQuaData start_label_id = get_label_id(),
				 end_label_id = get_label_id();
		push_start(start_label_id);
		push_end(end_label_id);
		add_qua(CQuaFactory.create_qua(
				QuaType.LABEL, 
				start_label_id,
				-1));
		
		add_qua(CQuaFactory.create_qua(
				QuaType.IF_NOT, 
				visitPro_e(ctx.pro_e()), 
				end_label_id,
				ctx.pro_e().start.getLine()));
		
		visitStatement(ctx.statement());
		
		add_qua(CQuaFactory.create_qua(
				QuaType.GOTO, 
				start_label_id,
				-1));
		add_qua(CQuaFactory.create_qua(
				QuaType.LABEL, 
				end_label_id,
				-1));
		pop_start();
		pop_end();
		return null; 
	}
	
	@Override public CQuaData visitBreak_stat(@NotNull BStarParser.Break_statContext ctx) {
		CQuaData cur_end_id = get_cur_end();
		if(cur_end_id != null){
			add_qua(CQuaFactory.create_qua(
					QuaType.GOTO, 
					cur_end_id, 
					-1));
		}
		else{
			//TODO 无循环写break错误处理
		}
		return null; 
	}
	
	@Override public CQuaData visitContinue_stat(@NotNull BStarParser.Continue_statContext ctx) {
		CQuaData cur_start_id = get_cur_start();
		if(cur_start_id != null){
			add_qua(CQuaFactory.create_qua(
					QuaType.GOTO, 
					cur_start_id,
					-1));
		}
		else{
			//TODO 无循环写continue错误处理
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAt_str(@NotNull BStarParser.At_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPara_value_list(@NotNull BStarParser.Para_value_listContext ctx) { 
		for(BStarParser.ElementContext cur_element: ctx.element()){
			add_qua(CQuaFactory.create_qua(
					QuaType.CALL_PARA, 
					visitElement(cur_element),
					cur_element.start.getLine()));
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitIncludes(@NotNull BStarParser.IncludesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPro_term_e(@NotNull BStarParser.Pro_term_eContext ctx) { 
		CQuaData return_result = null;
		if(ctx.quan_e() != null){
			return_result = visitQuan_e(ctx.quan_e());
		}
		else if(ctx.condition_term() != null){
			return_result = visitCondition_term(ctx.condition_term());
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitId(@NotNull BStarParser.IdContext ctx) { 
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.ID;
		return_result.str_data_0 = ctx.getText();
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitReal(@NotNull BStarParser.RealContext ctx) { return visitChildren(ctx); }
	
	@Override public CQuaData visitMse_1(@NotNull BStarParser.Mse_1Context ctx) {
		CQuaData return_result = visitMse_0(ctx.mse_0());
		if(ctx.mse_1_latter() != null && !ctx.mse_1_latter().isEmpty()){
			CQuaData compute_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					ctx.mse_1_latter(0).start.getType(), 
					return_result, 
					visitMse_0(ctx.mse_1_latter(0).mse_0()), 
					compute_result,
					ctx.mse_1_latter(0).start.getLine()));
			for(int i = 1; i < ctx.mse_1_latter().size(); i++){
				add_qua(CQuaFactory.create_qua(
						ctx.mse_1_latter(i).start.getType(),
						compute_result,
						visitMse_0(ctx.mse_1_latter(i).mse_0()),
						compute_result,
						ctx.mse_1_latter(i).start.getLine()));
			}
			return_result = compute_result;
		}
		return return_result; 
	}

	@Override public CQuaData visitMse_0(@NotNull BStarParser.Mse_0Context ctx) { 
		return visitUnary_e(ctx.unary_e()); 
	}
	
	@Override public CQuaData visitVar_define(@NotNull BStarParser.Var_defineContext ctx) { 
		if(ctx.start.getType() != BStarParser.TYPEDEF){
			CQuaData cur_type = visitType(ctx.type());
			for(BStarParser.Single_var_defineContext cur_var_ctx: ctx.single_var_define()){
				CQuaData cur_id = null,
						 temp_type = new CQuaData(cur_type);
				int cur_line_num = -1;
				if(cur_var_ctx.point_id() != null){
					cur_id = visitPoint_id(cur_var_ctx.point_id());
					++cur_id.value_data;
					cur_line_num = cur_var_ctx.point_id().start.getLine();
				}
				else if(cur_var_ctx.id() != null){
					cur_id = new CQuaData();
					cur_id.type = QuaDataType.ID;
					cur_id.str_data_0 = cur_var_ctx.id().getText();
					cur_line_num = cur_var_ctx.id().start.getLine();
				}				
				temp_type.value_data = cur_id.value_data;
				cur_id.value_data = 0.0;
				CQuaData cur_element = null;
				if(cur_var_ctx.element() != null){
					cur_element = visitElement(cur_var_ctx.element());
				}
				add_qua(CQuaFactory.create_qua(
						QuaType.VAR_DEFINE, 
						cur_id, 
						temp_type, 
						cur_element,
						cur_line_num));
			}
		}
		else{
			if(ctx.enum_type() != null){
				visitEnum_type(ctx.enum_type(), visitId(ctx.id()), ctx.id().start.getLine());
			}
			else if(ctx.type() != null){
				add_qua(CQuaFactory.create_qua(
						QuaType.TYPE_DEF, 
						visitType(ctx.type()), 
						visitPoint_id(ctx.point_id()),
						ctx.point_id().start.getLine()));
			}
			else if(ctx.struct_type() != null){
				BStarParser.Struct_typeContext cur_struct = ctx.struct_type();
				CQuaData id_list = new CQuaData(), type_list = new CQuaData();
				id_list.type = QuaDataType.ID_LIST;
				type_list.type = QuaDataType.TYPE_LIST;
				for(int i = 0; i < cur_struct.point_id().size(); ++i){
					CQuaData cur_id = visitPoint_id(cur_struct.point_id(i)),
							cur_type = visitType(cur_struct.type(i));
					cur_type.value_data = cur_id.value_data;
					cur_id.value_data = 0.0;
					id_list.add_list_data(cur_id);
					type_list.add_list_data(cur_type);
				}
				add_qua(CQuaFactory.create_qua(
						QuaType.STRUCT_DEF, 
						id_list, 
						type_list, 
						visitPoint_id(ctx.point_id()),
						ctx.point_id().start.getLine()));
			}
		}
		return null; 
	}
	
	public void visitEnum_type(BStarParser.Enum_typeContext ctx, CQuaData in_name, int in_name_line_num){
		CQuaData enum_id_list = new CQuaData(),
				 enum_value_list = new CQuaData();
		enum_id_list.type = QuaDataType.ID_LIST;
		enum_value_list.type = QuaDataType.VALUE_LIST;
		for(BStarParser.Single_enum_typeContext cur_enum: ctx.single_enum_type()){
			CQuaData cur_id, cur_value;
			cur_id = visitId(cur_enum.id());
			if(cur_enum.unary_e() != null){
				cur_value = visitUnary_e(cur_enum.unary_e());
			}
			else{
				cur_value = new CQuaData();
				cur_value.type = QuaDataType.NIL;
			}
			enum_id_list.add_list_data(cur_id);
			enum_value_list.add_list_data(cur_value);
		}
		add_qua(CQuaFactory.create_qua(
				QuaType.ENUM_DEF, 
				enum_id_list, 
				enum_value_list, 
				in_name,
				in_name_line_num));
	}
	
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitReturn_stat(@NotNull BStarParser.Return_statContext ctx) { 
		if(ctx.element() != null){
			add_qua(CQuaFactory.create_qua(
					QuaType.RETURN, 
					visitElement(ctx.element()),
					ctx.RETURN().getSymbol().getLine()));
		}
		else{
			add_qua(CQuaFactory.create_qua(
					QuaType.RETURN,
					ctx.RETURN().getSymbol().getLine()));
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitImp_pro_e(@NotNull BStarParser.Imp_pro_eContext ctx) { 
		CQuaData return_result = get_temp_id();
		add_qua(CQuaFactory.create_qua(
				QuaType.CDT_IMPL, 
				visitOr_pro_e(ctx.or_pro_e(0)), 
				visitOr_pro_e(ctx.or_pro_e(1)), 
				return_result,
				ctx.IMPLICATION().getSymbol().getLine()));
		return return_result; 
	}

	@Override public CQuaData visitMse(@NotNull BStarParser.MseContext ctx) { 
		CQuaData return_result = visitMse_1(ctx.mse_1());
		if(ctx.mse_latter() != null && !ctx.mse_latter().isEmpty()){
			CQuaData compute_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					ctx.mse_latter(0).start.getType(),
					return_result,
					visitMse_1(ctx.mse_latter(0).mse_1()), 
					compute_result,
					ctx.mse_latter(0).start.getLine())
					);
			for(int i = 1; i < ctx.mse_latter().size(); ++i){
				add_qua(CQuaFactory.create_qua(
						ctx.mse_latter(i).start.getType(),
						compute_result,
						visitMse_1(ctx.mse_latter(i).mse_1()), 
						compute_result,
						ctx.mse_latter(i).start.getLine())
						);
			}
			return_result = compute_result;
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDeclare_operations(@NotNull BStarParser.Declare_operationsContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitNormal_type(@NotNull BStarParser.Normal_typeContext ctx) { 
		CQuaData return_result = new CQuaData();
		return_result.type = QuaDataType.TYPE;
		return_result.str_data_0 = ctx.getText();
		return return_result; 
	}

	@Override public CQuaData visitUnary_e(@NotNull BStarParser.Unary_eContext ctx) { 
		CQuaData return_result = null;
		if(ctx.one_e() != null){
			return_result = visitOne_e(ctx.one_e());
		}
		else if(ctx.term() != null){
			int cur_type = ctx.start.getType();
			if(cur_type == BStarParser.ADD){
				return_result = visitTerm(ctx.term());
			}
			else if(cur_type == BStarParser.SUB){
				return_result = get_temp_id();
				add_qua(CQuaFactory.create_qua(
						QuaType.MATH_REV, 
						visitTerm(ctx.term()), 
						return_result,
						ctx.start.getLine()));
			}
		}
		return return_result;
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDefine(@NotNull BStarParser.DefineContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitRobust(@NotNull BStarParser.RobustContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitDeclares(@NotNull BStarParser.DeclaresContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFalse_str(@NotNull BStarParser.False_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitInteger(@NotNull BStarParser.IntegerContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitStatement_at(@NotNull BStarParser.Statement_atContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAddr_id(@NotNull BStarParser.Addr_idContext ctx) { return visitChildren(ctx); }

	@Override public CQuaData visitCv_define(@NotNull BStarParser.Cv_defineContext ctx) { 
		if(ctx.single_cv_define() != null){
			for(BStarParser.Single_cv_defineContext cur_ctx: ctx.single_cv_define()){
				visitSingle_cv_define(cur_ctx);
			}
		}
		return null; 
	}
	
	@Override public CQuaData visitSingle_cv_define(@NotNull BStarParser.Single_cv_defineContext ctx){
		if(ctx.var_define() != null){
			visitVar_define(ctx.var_define());
		}
		else if(ctx.cst_define() != null){
			visitCst_define(ctx.cst_define());
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAttributes_2(@NotNull BStarParser.Attributes_2Context ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitElement_take(@NotNull BStarParser.Element_takeContext ctx) { 
		/*CQuaData search_condition = get_temp_id();
		add_qua(CQuaFactory.create_qua(QuaType.DEF_SEARCH_CDT, search_condition));
		for(int i = 0; i < ctx.belong_pair().size(); ++i){
			BStarParser.Belong_pairContext cur_pair = ctx.belong_pair(i);
			visitBelong_pair(cur_pair, search_condition);
		}
		//result is search result
		CQuaData search_result = get_temp_id(),
				 search_set = visitMse(ctx.mse());
		add_qua(CQuaFactory.create_qua(QuaType.SET_SEARCH, search_condition, search_set, search_result));
		add_qua(CQuaFactory.create_qua(QuaType.SEARCH_ASSIGN, search_result, term_former, get_temp_id()));
		return null;*/
		return visitTerm(ctx.term());
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAssign_stat(@NotNull BStarParser.Assign_statContext ctx) { 
		if(ctx.id() != null && !ctx.id().isEmpty()){
			CQuaData dst_assign = visitPoint_id(ctx.point_id());
			for(BStarParser.IdContext cur_id: ctx.id()){
				CQuaData temp_data = get_temp_id(),
						 id_data = new CQuaData();
				id_data.type = QuaDataType.ID;
				id_data.str_data_0 = cur_id.getText();
				add_qua(CQuaFactory.create_qua(
						QuaType.BASE_ADDRESS, 
						dst_assign, 
						id_data, 
						temp_data,
						cur_id.start.getLine()));
				dst_assign = temp_data;
			}
			add_qua(CQuaFactory.create_qua(
					QuaType.ASSIGN_VALUE, 
					dst_assign, 
					visitElement(ctx.element()),
					ctx.element().start.getLine())
					);
		}
		else{
			add_qua(CQuaFactory.create_qua(
					QuaType.ASSIGN_VALUE, 
					visitPoint_id(ctx.point_id()), 
					visitElement(ctx.element()),
					ctx.element().start.getLine()
					));
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitPoint(@NotNull BStarParser.PointContext ctx) { return visitChildren(ctx); }
	
	@Override public CQuaData visitTerm(@NotNull BStarParser.TermContext ctx) { 
		CQuaData term_former = new CQuaData();
		if(ctx.nil() != null){
			term_former.type = QuaDataType.NIL;
		}
		else if(ctx.string() != null){
			term_former.type = QuaDataType.STRING;
			String temp_str = ctx.string().getText();
			term_former.str_data_0 = temp_str.substring(1, temp_str.length() - 1);
		}
		else if(ctx.true_str() != null){
			term_former.type = QuaDataType.INT;
			term_former.value_data = 1.0;
		}
		else if(ctx.false_str() != null){
			term_former.type = QuaDataType.INT;
			term_former.value_data = 0.0;
		}
		else if(ctx.integer() != null){
			term_former.type = QuaDataType.INT;
			term_former.value_data = CMath.str_to_double(ctx.integer().getText());
		}
		else if(ctx.real() != null){
			term_former.type = QuaDataType.DOUBLE;
			term_former.value_data = CMath.str_to_double(ctx.real().getText());
		}
		else if(ctx.char_str() != null){
			term_former.type = QuaDataType.CHAR;
			term_former.value_data = ctx.char_str().getText().charAt(1);
		}
		else if(ctx.term_set() != null){
			term_former.type = QuaDataType.SET;
			visitMulti_term(ctx.term_set().element(), term_former);
		}
		else if(ctx.term_tuple() != null){
			term_former.type = QuaDataType.TUPLE;
			visitMulti_term(ctx.term_tuple().element(), term_former);
		}
		else if(ctx.function_call() != null){
			visitFunction_call(ctx.function_call());
			term_former = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.GET_RETURN, 
					term_former,
					ctx.function_call().start.getLine()));
		}
		else if(ctx.id() != null){
			term_former.type = QuaDataType.ID;
			term_former.str_data_0 = ctx.id().getText();
		}
		else if(ctx.element() != null){
			term_former = visitElement(ctx.element());
		}
		
		CQuaData return_result = null;
		
		if(ctx.term_latter() != null && !ctx.term_latter().isEmpty()){
			return_result = term_former;
			for(int i = 0; i < ctx.term_latter().size(); ++i){
				return_result = visitTerm_latter(ctx.term_latter(i), return_result);
			}
		}
		else{
			return_result = term_former;
		}
		return return_result; 
	}
	
	public void visitBelong_pair(BStarParser.Belong_pairContext ctx, CQuaData search_condition){
		
		CQuaData condition_former = new CQuaData();;
		if(ctx.id() != null){
			condition_former.type = QuaDataType.ID;
			condition_former.str_data_0 = ctx.id().getText();
		}
		else if(ctx.integer() != null){
			
		}
		add_qua(CQuaFactory.create_qua(
					QuaType.ADD_SEARCH, 
					condition_former, 
					visitElement(ctx.element()),
					search_condition,
					ctx.element().start.getLine()
					)
				);
	}
	
	public CQuaData visitTerm_latter(BStarParser.Term_latterContext ctx, CQuaData term_former){
		CQuaData return_result = null;
		if(ctx.belong_pair() != null && !ctx.belong_pair().isEmpty()){
			return_result = get_temp_id();
			CQuaData search_condition = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.DEF_SEARCH_CDT, 
					search_condition, 
					ctx.belong().start.getLine()
					));
			for(int i = 0; i < ctx.belong_pair().size(); ++i){
				BStarParser.Belong_pairContext cur_pair = ctx.belong_pair(i);
				visitBelong_pair(cur_pair, search_condition);
			}
			//result is search result
			CQuaData search_result = get_temp_id(),
					 search_set = visitMse(ctx.mse());
			add_qua(CQuaFactory.create_qua(
					QuaType.SET_SEARCH, 
					search_condition, 
					search_set, 
					search_result,
					ctx.belong().start.getLine()));
			QuaType search_type = null;
			if(ctx.belong() != null){
				search_type = QuaType.SEARCH_ASSIGN;
			}
			else{
				search_type = QuaType.SEARCH_ASSIGN_NOT;
			}
			add_qua(CQuaFactory.create_qua(
					search_type, 
					search_result, 
					term_former, 
					return_result,
					ctx.belong().start.getLine()));
		}
		else if(ctx.start.getType() == BStarParser.POINT){
			return_result = get_temp_id();
			CQuaData cur_id = new CQuaData();
			cur_id.type = QuaDataType.ID;
			cur_id.str_data_0 = ctx.id().getText();
			add_qua(CQuaFactory.create_qua(
					QuaType.BASE_ADDRESS, 
					term_former, 
					cur_id,
					return_result,
					ctx.id().start.getLine()));
		}
		else if(ctx.start.getType() == BStarParser.ADDRGET){
			CQuaData 	pointer_content = get_temp_id(),
						cur_id = new CQuaData();
			return_result = get_temp_id();
			cur_id.type = QuaDataType.ID;
			cur_id.str_data_0 = ctx.id().getText();
			add_qua(CQuaFactory.create_qua(
					QuaType.CONTENT_OF, 
					term_former, 
					pointer_content,
					ctx.id().start.getLine()
					));
			add_qua(CQuaFactory.create_qua(
					QuaType.BASE_ADDRESS,
					pointer_content,
					cur_id,
					return_result,
					ctx.id().start.getLine()
					));
		}
		return return_result;
	}
	
	public void visitMulti_term(List<BStarParser.ElementContext> element_list, CQuaData in_data){
		for (BStarParser.ElementContext cur_element : element_list) {
			in_data.add_list_data(visitElement(cur_element));
		}
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitCfunction_declare(@NotNull BStarParser.Cfunction_declareContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitTrue_str(@NotNull BStarParser.True_strContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitString(@NotNull BStarParser.StringContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitOr_pro_e(@NotNull BStarParser.Or_pro_eContext ctx) { 
		CQuaData return_result = visitAnd_pro_e(ctx.and_pro_e(0));
		if(ctx.and_pro_e().size() > 1){
			CQuaData first_data = return_result;
			return_result = get_temp_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.CDT_DISJ, 
					first_data, 
					visitAnd_pro_e(ctx.and_pro_e(1)),
					return_result,
					ctx.and_pro_e(1).start.getLine()));
			for(int i = 2; i < ctx.and_pro_e().size(); i++){
				add_qua(CQuaFactory.create_qua(
						QuaType.CDT_DISJ, 
						return_result, 
						visitAnd_pro_e(ctx.and_pro_e(i)),
						return_result,
						ctx.and_pro_e(i).start.getLine()));
			}
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitFunction_declare(@NotNull BStarParser.Function_declareContext ctx) { 
		add_qua(CQuaFactory.create_qua(
				QuaType.FUNC_DECLARE, 
				visitPoint_id(ctx.point_id()), 
				visitType(ctx.type()),
				ctx.point_id().start.getLine()));
		visitPara_define_list(ctx.para_define_list());
		add_qua(CQuaFactory.create_qua(QuaType.FUNC_DECLARE_END, -1));
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitAttributes(@NotNull BStarParser.AttributesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitOperations(@NotNull BStarParser.OperationsContext ctx) { 
		for(BStarParser.Function_defineContext cur_func: ctx.function_define()){
			visitFunction_define(cur_func);
		}
		return null; 
	}

	@Override public CQuaData visitPoint_id(@NotNull BStarParser.Point_idContext ctx) { 
		CQuaData return_result = null;
		if(ctx.start.getType() == BStarParser.MUL){
			return_result = visitPoint_id(ctx.point_id());
			++return_result.value_data;
		}
		else if(ctx.start.getType() == BStarParser.L_BRACKET){
			return_result = visitPoint_id(ctx.point_id());
		}
		else if(ctx.id() != null){
			return_result = new CQuaData();
			return_result.type = QuaDataType.ID;
			return_result.str_data_0 = ctx.id().getText();			
		}
		return return_result; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitIf_stat(@NotNull BStarParser.If_statContext ctx) { 
		if(ctx.else_stat() == null){
			CQuaData end_label = get_label_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.IF_NOT, 
					visitPro_e(ctx.pro_e()), 
					end_label,
					ctx.pro_e().start.getLine()));
			visitStatement(ctx.statement());
			add_qua(CQuaFactory.create_qua(QuaType.LABEL, end_label, -1));
		}
		else{
			CQuaData end_label = get_label_id(),
					else_label = get_label_id();
			add_qua(CQuaFactory.create_qua(
					QuaType.IF_NOT, 
					visitPro_e(ctx.pro_e()), 
					else_label,
					ctx.pro_e().start.getLine()));
			visitStatement(ctx.statement());
			add_qua(CQuaFactory.create_qua(QuaType.GOTO, end_label, -1));
			add_qua(CQuaFactory.create_qua(QuaType.LABEL, else_label, -1));
			visitStatement(ctx.else_stat().statement());
			add_qua(CQuaFactory.create_qua(QuaType.LABEL, end_label, -1));
		}
		return null; 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public CQuaData visitNil(@NotNull BStarParser.NilContext ctx) { return visitChildren(ctx); }
}
