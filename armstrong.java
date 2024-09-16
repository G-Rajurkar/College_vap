import java.util.Scanner;


public class Armstrong {
     public static void main(String[] args) {

        int n, m, rem, result = 0;
          Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number");  
       n = sc.nextInt();  

        m = n;

        while (m != 0)
        {
            rem = m % 10;
            result += Math.pow(rem, 3);
            m /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
    
}
