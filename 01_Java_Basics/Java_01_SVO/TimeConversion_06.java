// 6. Convert seconds into hours:minutes:seconds.
import java.util.Scanner;
public class TimeConversion_06{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the input Seconds : ");
        int Seconds = input.nextInt();

        System.out.println("Given Seconds " + Seconds);

        int hours = Seconds / 3600;
            Seconds = Seconds % 3600;
        int minutes = Seconds / 60;
            Seconds = Seconds % 60;
        int seconds = Seconds;

        
        System.out.println("Given Seconds into hour:minutes:seconds format --> " + hours + ":" + minutes + ":" + seconds );

    }
}
