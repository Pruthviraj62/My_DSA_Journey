//13.Take a number and print the next three numbers.
import java.util.Scanner;
public class Next_3_num_13 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num : ");
        int num = sc.nextInt();
        System.out.println("Next three nums are : " + (num+1) + " " + (num+2) + " " + (num+3) );
        sc.close();
    }    
}
