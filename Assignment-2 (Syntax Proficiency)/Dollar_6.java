/*6. Input currency in rupees and output in USD.*/

import java.util.Scanner;
public class Dollar_6{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the rupees : ");
        double rupees = input.nextDouble();
        
        double dollar = rupees * 0.0114;
        
        System.out.println("Rupees in dollar are " + dollar);
        input.close();
    }
}