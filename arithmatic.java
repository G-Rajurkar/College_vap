import java.util.Scanner;

/**
 *
 * @author OOPL-18
 */
public class Main {
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float devide,rem ;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;
    rem = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
      System.out.println("remainder = " + rem);
  }
    
}
