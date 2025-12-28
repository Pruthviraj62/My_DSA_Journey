// 09]To find Armstrong Number between two given number.
import java.util.Scanner;
public class Armstrong_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;

        int r , sum = 0;

        while(num > 0){
            r = num %10;
            num = num / 10;
            sum = sum + r*r*r;
        }

        if(temp == sum){
            System.out.println(temp + " is an armstron number...!");
        }else{
            System.out.println(temp + " is not an armstrong number....!");
        }
        sc.close();
    }
    
}
