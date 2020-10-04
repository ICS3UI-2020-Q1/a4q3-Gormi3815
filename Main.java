import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer to count down to");
    int number = input.nextInt();
    int count = 0;
    int sum = 0;
    while(count < number){
      count = count +1;
      sum = sum + count;
    }
    System.out.println("The sum from 1 -" + number + " is " + sum + ".");
  }
}
