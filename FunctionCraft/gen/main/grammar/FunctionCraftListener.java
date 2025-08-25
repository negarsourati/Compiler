// Generated from /Users/amin/Documents/UT/semester6/Compiler/ca/1/FunctionCraft 4/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(FunctionCraftParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(FunctionCraftParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#par_inside}.
	 * @param ctx the parse tree
	 */
	void enterPar_inside(FunctionCraftParser.Par_insideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#par_inside}.
	 * @param ctx the parse tree
	 */
	void exitPar_inside(FunctionCraftParser.Par_insideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#obt_pars}.
	 * @param ctx the parse tree
	 */
	void enterObt_pars(FunctionCraftParser.Obt_parsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#obt_pars}.
	 * @param ctx the parse tree
	 */
	void exitObt_pars(FunctionCraftParser.Obt_parsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#obts}.
	 * @param ctx the parse tree
	 */
	void enterObts(FunctionCraftParser.ObtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#obts}.
	 * @param ctx the parse tree
	 */
	void exitObts(FunctionCraftParser.ObtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_obj}.
	 * @param ctx the parse tree
	 */
	void enterReturn_obj(FunctionCraftParser.Return_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_obj}.
	 * @param ctx the parse tree
	 */
	void exitReturn_obj(FunctionCraftParser.Return_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ret_exp}.
	 * @param ctx the parse tree
	 */
	void enterRet_exp(FunctionCraftParser.Ret_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ret_exp}.
	 * @param ctx the parse tree
	 */
	void exitRet_exp(FunctionCraftParser.Ret_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(FunctionCraftParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(FunctionCraftParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lam_pars}.
	 * @param ctx the parse tree
	 */
	void enterLam_pars(FunctionCraftParser.Lam_parsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lam_pars}.
	 * @param ctx the parse tree
	 */
	void exitLam_pars(FunctionCraftParser.Lam_parsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(FunctionCraftParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(FunctionCraftParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#user_def}.
	 * @param ctx the parse tree
	 */
	void enterUser_def(FunctionCraftParser.User_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#user_def}.
	 * @param ctx the parse tree
	 */
	void exitUser_def(FunctionCraftParser.User_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#call_pars}.
	 * @param ctx the parse tree
	 */
	void enterCall_pars(FunctionCraftParser.Call_parsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#call_pars}.
	 * @param ctx the parse tree
	 */
	void exitCall_pars(FunctionCraftParser.Call_parsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#instructs}.
	 * @param ctx the parse tree
	 */
	void enterInstructs(FunctionCraftParser.InstructsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#instructs}.
	 * @param ctx the parse tree
	 */
	void exitInstructs(FunctionCraftParser.InstructsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(FunctionCraftParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(FunctionCraftParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(FunctionCraftParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(FunctionCraftParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void enterLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void exitLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(FunctionCraftParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(FunctionCraftParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(FunctionCraftParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(FunctionCraftParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void enterBool_exp(FunctionCraftParser.Bool_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bool_exp}.
	 * @param ctx the parse tree
	 */
	void exitBool_exp(FunctionCraftParser.Bool_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#arith_exp}.
	 * @param ctx the parse tree
	 */
	void enterArith_exp(FunctionCraftParser.Arith_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#arith_exp}.
	 * @param ctx the parse tree
	 */
	void exitArith_exp(FunctionCraftParser.Arith_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(FunctionCraftParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(FunctionCraftParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_inside}.
	 * @param ctx the parse tree
	 */
	void enterList_inside(FunctionCraftParser.List_insideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_inside}.
	 * @param ctx the parse tree
	 */
	void exitList_inside(FunctionCraftParser.List_insideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_obj}.
	 * @param ctx the parse tree
	 */
	void enterList_obj(FunctionCraftParser.List_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_obj}.
	 * @param ctx the parse tree
	 */
	void exitList_obj(FunctionCraftParser.List_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(FunctionCraftParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(FunctionCraftParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FunctionCraftParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FunctionCraftParser.IdentifierContext ctx);
}