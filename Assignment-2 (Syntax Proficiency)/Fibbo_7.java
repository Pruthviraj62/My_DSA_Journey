import java.util.Scanner;

public class Fibbo_7 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the series length (n): ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;

        int i = 0;
        while (i < n) {
            System.out.print(first + " "); // print current term
            int next = first + second;     // calculate next term
            first = second;                // move forward
            second = next;
            i++;
        }
    }
}
