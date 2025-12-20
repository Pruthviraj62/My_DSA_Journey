// 10. Convert ASCII value to character and vice-versa.
import java.util.Scanner;
public class Ascii_Char_10 {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);

    int choice = 0;

    while(choice != 3){
    
    System.out.println("1.Convert the ASCII to Char  ");
    System.out.println("2.Convert Char to ASCII ");
    System.out.println("3.Exit");

    System.out.print("Select the choice from above list : ");
    choice = sc.nextInt();

    if(choice == 1){
        System.out.print("Enter the Ascii value : ");
        int ascii = sc.nextInt();
        char ch = (char) ascii;
        System.out.println("Given ascii into char is :" + ch );
    
    }else if(choice == 2){
        System.out.print("Enter the char : ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("Given value into ascii is : " + ascii);

    }else{
        System.out.println("Exiting......!");
    }

}
    }
}