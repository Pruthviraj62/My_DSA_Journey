// 8.Find simple interest and compound interest.
import java.util.Scanner;
public class SImple_Compound_08 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle : ");
        double principle = sc.nextDouble();
        System.out.print("Enter the Rate of interest : ");
        double interest = sc.nextDouble();
        System.out.print("Enter the Time in years : ");
        double time = sc.nextDouble();

        double simple_interest =((principle * interest * time) / 100 );
   
        double amount = principle * Math.pow((1 + (interest / 100)), time);
        double compound_interest = amount - principle;

        System.out.println("The Simple interest for " + principle + " in the time of " + time + " years is " + simple_interest );
        System.out.println("The Compound interest for " + principle + " in the time of " + time + " years is " + compound_interest );

    }
}



         