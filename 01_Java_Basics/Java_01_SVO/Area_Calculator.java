// 9.Find the area of circle, triangle, rectangle (menu-driven).
import java.util.Scanner;
public class Area_Calculator {

    static void circle_area(Scanner sc){
            System.out.print("Enter the radius of circle : ");
            double radius = sc.nextDouble();
            double circle_area = (3.14 * radius * radius); 
            System.out.println("the area of circle is : " + circle_area);
        }
    
    static void triangle_area(Scanner sc){
            System.out.print("Enter the base of triangle :  ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of triangle : ");
            double height = sc.nextDouble();
            double triangle_area = (0.5 * base * height);
            System.out.println("the area of triangle is : " + triangle_area);
    }

    static void rectangle_area(Scanner sc){
            System.out.print("Enter the length of rectangle : ");
            double length = sc.nextDouble();
            System.out.print("Enter the breadth of rectangle : ");
            double breadth = sc.nextDouble();
            double rectangle_area = length * breadth;
            System.out.println("The area of rectangle is : " + rectangle_area);
        }
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int choice = 0;
       while(choice != 4){ 
        
        System.out.println("--------------Area Calculator-----------------");
        System.out.println("1.Area of Circle ");
        System.out.println("2.Area of Triangle ");
        System.out.println("3.Area of Rectangle ");
        System.out.println("4.Exit");
        System.out.print("Enter the choice number from the above list : ");
        choice = sc.nextInt();

       

        switch(choice) {
            case 1 :
                circle_area(sc);
                break;
            case 2 :
                triangle_area(sc);
                break;
            case 3 : 
                rectangle_area(sc);
                break;
            case 4 :
                System.out.println("Exiting.....!");     
                break;  
            default :
                System.out.println("Enter the valid choice........");
                
        }
        }
        
        sc.close();
        
    }
    
}
