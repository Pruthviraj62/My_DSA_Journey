//3.Swap two numbers using a third variable.

public class Swap_03 {
    public static void main(String[] arg){
            int num1 = 10;
            int num2 = 20;
            int temp;
            
            System.out.println("Num1 before Swaping : " + num1);
            System.out.println("Num2 Before Swaping : " + num2);

            // logic

            temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("Num1 After Swaping : " + num1);
            System.out.println("Num2 After Swaping : " + num2);
            
    }
    
}
