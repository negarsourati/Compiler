// Generated from /Users/amin/Documents/UT/semester6/Compiler/ca/1/FunctionCraft 4/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(FunctionCraftParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#par_inside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_inside(FunctionCraftParser.Par_insideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#obt_pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObt_pars(FunctionCraftParser.Obt_parsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#obts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObts(FunctionCraftParser.ObtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_obj(FunctionCraftParser.Return_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ret_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_exp(FunctionCraftParser.Ret_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(FunctionCraftParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(FunctionCraftParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lam_pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLam_pars(FunctionCraftParser.Lam_parsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(FunctionCraftParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#user_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_def(FunctionCraftParser.User_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#call_pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_pars(FunctionCraftParser.Call_parsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#instructs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructs(FunctionCraftParser.InstructsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(FunctionCraftParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(FunctionCraftParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(FunctionCraftParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(FunctionCraftParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bool_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_exp(FunctionCraftParser.Bool_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#arith_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_exp(FunctionCraftParser.Arith_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(FunctionCraftParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(FunctionCraftParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_inside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_inside(FunctionCraftParser.List_insideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_obj(FunctionCraftParser.List_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(FunctionCraftParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FunctionCraftParser.IdentifierContext ctx);
}