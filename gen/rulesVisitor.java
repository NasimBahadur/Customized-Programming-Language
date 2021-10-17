// Generated from /home/user/code/Project_CSE375/project375/rules.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link rulesParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(rulesParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(rulesParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(rulesParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#headerFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderFile(rulesParser.HeaderFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#macros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacros(rulesParser.MacrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(rulesParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(rulesParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(rulesParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(rulesParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(rulesParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(rulesParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#continueBreakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueBreakStatement(rulesParser.ContinueBreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#constantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantStatement(rulesParser.ConstantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(rulesParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(rulesParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(rulesParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(rulesParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(rulesParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(rulesParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(rulesParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(rulesParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(rulesParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(rulesParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(rulesParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#incrementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOperator(rulesParser.IncrementOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#decrementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementOperator(rulesParser.DecrementOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(rulesParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(rulesParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(rulesParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(rulesParser.DataTypeContext ctx);
}