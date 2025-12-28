//4.Swap two numbers without using a third variable.
public class Swap_04 {
    public static void main(String[] arg){
        int num1 = 10;
        int num2 = 20;

        System.out.println("Num1 Before Swap : " + num1);
        System.out.println("Num2 Before Swap : " + num2 );

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Num1 After Swap : " + num1);
        System.out.println("Num2 After Swap : " + num2 );

        
    }
}
