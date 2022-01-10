import java.util.Scanner;

public class BiggestNumber{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        final int num_a = scan.nextInt();

        System.out.println("Enter a number:");
        final int num_b = scan.nextInt();

        System.out.println("Enter a number:");
        final int num_c = scan.nextInt();

        System.out.println("Biggest number:");
        if(num_a > num_b) {
          if(num_b > num_c) {
            System.out.println(num_a);
          }
          else if(num_a > num_c) {
            System.out.println(num_a);
          }
          else {
            System.out.println(num_c);
          }
        } else { // num_b > num_a
          if (num_b > num_c) {
            System.out.println(num_b);
          } else {
            System.out.println(num_c);
          }
        }
     }
}