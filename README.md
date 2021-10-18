# Customized-Programming-Language
Generating a parser for a customized (imaginary) programming language, I have made a grammar for that customized programming language and checked that with right and wrong input code.

# Grammar overview
Terminal and non-terminal symbols are the lexical parts used in deciding the creation rules setting up a customary programming language. Terminal symbols are simple symbols described by an ordinary programming language. Grammar is not just used to portray the formulation of a programming language, it is furthermore used to compiler forming.

**Description:**

1. Semicolon is mandatory to indicate the end of a line. Every expression should be in a particular block. Each block starts with opening curly-brace and ends with closing curly-brace.

2. The Operators are:

   - binary operator: =, +, -, *, /, +=, -=, *=, /=, %=

   - logical operator: &&,||,!, AND, OR, NOT

   - relational operator: ==, !=, <, >, <=, >=

   - increment operator: ++

   - decrement operator: --

3. Language begins with one or more header files with keyword **include**. There are at least one or more header files can be exist. 

   ![1](https://user-images.githubusercontent.com/43060004/137789324-43cc39ba-95d4-48b1-b3af-210b728e8b03.png)

4. Many or no macros can exist in the program. If macros exist, it will begins with keyword **define**

   ![2](https://user-images.githubusercontent.com/43060004/137789331-5e9bd8ee-d3c6-43d2-b81d-08cfe6af3bb9.png)

5. Program execution starts in the main function.

   ![3](https://user-images.githubusercontent.com/43060004/137794101-bc2476e7-ef29-4cd0-a9a1-293eb1b83ecb.png)

6. We have various types of type specifiers in this language:

   - **Integer, Float, Double, bool, String**

7. Without specifying type, User are also allowed to declare constant & variable. But before declaring a constant, user need to write the keyword **constant**.

   ![7](https://user-images.githubusercontent.com/43060004/137789343-f82727d9-418d-489d-9785-e0652d51d12d.png)

8. User can take input as given below.

   ![8](https://user-images.githubusercontent.com/43060004/137789347-23547b2f-37d9-408b-beb7-6e1c92b02d20.png)

9. Using print command, user can print.

   ![9](https://user-images.githubusercontent.com/43060004/137789348-fc23386f-21ab-422f-aa6a-8ef42f2d4881.png)

10. Function can be called also according to below syntax.

      ![6](https://user-images.githubusercontent.com/43060004/137789340-80fcc3e1-bba1-4b4f-9484-f585daa85b59.png)

11. We can also add additional functions. Function parameters are optional to use. Function can be called recursively.

      ![4](https://user-images.githubusercontent.com/43060004/137789334-e60c6091-fd6d-467f-9922-32091b864cc2.png)

      ![5](https://user-images.githubusercontent.com/43060004/137789336-b42ef98e-6b41-4916-9e3b-8d1d8a551080.png)

12. User can write conditional statement with **if, else if & else**. There could be multiple **else if** and an optional **else**.

      ![10](https://user-images.githubusercontent.com/43060004/137789349-e01b1778-daae-4831-9de9-6774fa02d2d1.png)
      
      ![11](https://user-images.githubusercontent.com/43060004/137795072-e88c179c-8cfe-4ed2-9078-30323734884c.png)

13. User can run two types of loop, **for** and **while** with **break** and **continue** statement.

      ![13](https://user-images.githubusercontent.com/43060004/137789359-5e208309-9792-487b-956d-f6e4a0ff759d.png)
      
      ![12](https://user-images.githubusercontent.com/43060004/137789356-a9ee85b1-878d-4541-a081-caa568379d39.png)
