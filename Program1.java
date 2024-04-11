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
  * Calculates the difference between two numbers
  * @author E.Fabroa
  * @param num1 the first number
  * @param num2 the second number
  * @return the difference between the two numbers
  */
  private int diff(int num1, int num2){
    return num1 - num2;
  }
}
