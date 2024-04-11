<!-- Output copied to clipboard! -->



# 3.4 Javadocs & Methods

Proper documentation of methods means using the javadocs style of commenting in your code. They are placed** immediately before your method** and the general format of it looks like this:


```
/**
* A description of your method
*
* @param parameterName1  Description of parameter 1
* @param parameterNameN  Description of parameter n
* @return description of the return value
*
*/

This is not a javadoc, this is a block comment
/*
this is my multiline comment
this is my multiline comment
this is my multiline comment
*/
```



### Example 1


```
/**
* Given two strings, return the concatenation of the two strings
*
* @param string1  The first string
* @param string2  The second string
* @return concatenation of string1 and string2
*
*/
private String combineStr(String string1, String string2){
        return string1+string2;
}
```



#### Example 3


```
public class JavaDocDemo extends ConsoleProgram{
   public void run(){
       System.out.println(diff(10,5));
   }

   /**
    * Computes the difference between two numbers
    *
    * @param num1  The first number
    * @param num2  The second number
    * @return The difference between the numbers
    *
    */
   private static int diff(int num1, int num2){
     return num1 - num2;
   }
}
```



### Example 4

Write the method for the problem below.  Include a proper javadoc.

You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

blueTicket(9, 1, 0) → 10

blueTicket(9, 2, 0) → 0

blueTicket(6, 1, 4) → 10

blueTicket(10,5,0) → 5
