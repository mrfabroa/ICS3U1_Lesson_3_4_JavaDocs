  /**
  * Demonstrate the use of javadocs
  * @author: E.Fabroa
  */


class Program1 extends ConsoleProgram {

  /**
  * Top level method to execute the program
  * @author: E.Fabroa
  */
  public void run(){
    System.out.println(diff(10,5));
  }

  /**
   * Compute the difference between two numbers
   * @param num1 the first number
   * @param num2 the second number
   * @return the difference between num1 and num2
   */
  private int diff(int num1, int num2){
    return num1 - num2;
  }

  /**
   * Compute the product of two integers
   * @param intNum1 the first number
   * @param intNum2 the second number
   * @return the product of the first and second number
   * @author E.Fabroa
   */
  private int multiply(int intNum1, int intNum2){
    return intNum1 * intNum2;
  }
}
