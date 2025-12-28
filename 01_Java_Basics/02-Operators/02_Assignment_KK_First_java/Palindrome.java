// Palindrome checker
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to check is it Palindrome : ");
        String str = sc.nextLine();

        String org_str = str.toLowerCase();
        
        int length = str.length();

        String rev_str = "";

        for(int i = length-1 ; i >= 0 ; i-- ){

            rev_str = rev_str + org_str.charAt(i);

        }

        if(org_str.equals(rev_str)){
            System.out.println(org_str + " is an Palindrome...!");
        }else{
            System.out.println(org_str + " is not a Palindrome...!");
        }

        sc.close();
    }
    
}
