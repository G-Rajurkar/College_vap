/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;


    public class Circle {
        public static void main(String[] args) {

  Scanner io = new Scanner(System.in);
  

  System.out.println("Input the radius of the circle: ");
  

  double radius = io.nextDouble();
  
  
  System.out.println("Perimeter is = " + (2 * radius * 3.14));
  
  
  System.out.println("Area is = " + (3.14 * radius * radius));
 }
}


