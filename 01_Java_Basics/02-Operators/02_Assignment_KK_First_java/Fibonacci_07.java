// 7] To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Fibonacci_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for  fibonacci series : ");
        int n = sc.nextInt();

        int firstterm = 0;
        int secondterm = 1;

        for(int i = 1; i <= n; i++){

            System.out.println("firstterm = " + firstterm);
            int nextterm = firstterm + secondterm;

            firstterm = secondterm;
            secondterm = nextterm;
            

        }
        sc.close();
    }
    
}
