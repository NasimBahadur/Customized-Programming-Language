// Generated from /home/user/code/Project_CSE375/project375/rules.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(rulesParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(rulesParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(rulesParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(rulesParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(rulesParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(rulesParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#headerFile}.
	 * @param ctx the parse tree
	 */
	void enterHeaderFile(rulesParser.HeaderFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#headerFile}.
	 * @param ctx the parse tree
	 */
	void exitHeaderFile(rulesParser.HeaderFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#macros}.
	 * @param ctx the parse tree
	 */
	void enterMacros(rulesParser.MacrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#macros}.
	 * @param ctx the parse tree
	 */
	void exitMacros(rulesParser.MacrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(rulesParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(rulesParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(rulesParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(rulesParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(rulesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(rulesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(rulesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(rulesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(rulesParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(rulesParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(rulesParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(rulesParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#continueBreakStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueBreakStatement(rulesParser.ContinueBreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#continueBreakStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueBreakStatement(rulesParser.ContinueBreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#constantStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstantStatement(rulesParser.ConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#constantStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstantStatement(rulesParser.ConstantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(rulesParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(rulesParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(rulesParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(rulesParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(rulesParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(rulesParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(rulesParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(rulesParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(rulesParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(rulesParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(rulesParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(rulesParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(rulesParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(rulesParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(rulesParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(rulesParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(rulesParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(rulesParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(rulesParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(rulesParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(rulesParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(rulesParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#incrementOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOperator(rulesParser.IncrementOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#incrementOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOperator(rulesParser.IncrementOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#decrementOperator}.
	 * @param ctx the parse tree
	 */
	void enterDecrementOperator(rulesParser.DecrementOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#decrementOperator}.
	 * @param ctx the parse tree
	 */
	void exitDecrementOperator(rulesParser.DecrementOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(rulesParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(rulesParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(rulesParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(rulesParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(rulesParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(rulesParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(rulesParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(rulesParser.DataTypeContext ctx);
}