import java.util.Scanner;

public class DisplayNumbers{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        final int num = scan.nextInt();

        System.out.println("\nDisplaying nummbers:");
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
     }
}