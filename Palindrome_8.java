
 import java.util.Scanner;
 public class Palindrome_8 {
     //To find out whether the given String is Palindrome or not.


     public static void main(String[] arg){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string : ");
         String str = sc.next();
         int start = 0;
         int end = str.length()-1;
         boolean ispalidrome = false;
         while(start < end){
             if(str.charAt(start) != str.charAt(end)){
                    ispalidrome = true;;
                 break;
             }
             else{
                 start++;
                 end--;
            }
         
             
         }
        if(ispalidrome){
             System.out.println("It is not a Palindrome...!");
            } else {
     System.out.println("Given string is palidrome...!");
     }
    }
 }

