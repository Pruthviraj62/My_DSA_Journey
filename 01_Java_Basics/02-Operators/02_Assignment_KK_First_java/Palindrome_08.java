// Q.8]To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Palindrome_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        
        
        str = str.toLowerCase(); 

        int i = 0;
        int len = str.length();
        boolean isPalindrome = true; 

       
        while (i < len / 2) {
            
         
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                isPalindrome = false; 
                break; 
            }
            i++;
        }

        
        if (isPalindrome) {
            System.out.println("Yes, it is a Palindrome.");
        } else {
            System.out.println("No, it is not a Palindrome.");
        }

        sc.close();
    }
}