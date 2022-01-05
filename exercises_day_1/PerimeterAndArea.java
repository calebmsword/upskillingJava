import java.util.Scanner;
import java.lang.Math;

class PerimeterAndArea {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    boolean noAnswerGiven = true;
    String answer = "t";

    // query triangle or rectangle
    while(noAnswerGiven) {
      System.out.println("Triangle (T/t) or Rectangle (R/r)?");
      answer = scan.nextLine();
      if (answer.equalsIgnoreCase("T") || answer.equalsIgnoreCase("R")) {
        noAnswerGiven = false;
      } else {
          System.out.println("Please enter t, T, R, or r.");
      }
    }
    
    // triangle
    if (answer.equalsIgnoreCase("T")) {
        System.out.println("Enter base:");
        final int base = scan.nextInt();
        System.out.println("Enter height:");
        final int height = scan.nextInt();
        System.out.println("Area: " + 0.5 * base * height);
        System.out.println("Perimeter (assuming right triangle): " + (base + height + 
        Math.sqrt(base*base+height*height)));
    }

    // rectangle
    if (answer.equalsIgnoreCase("R")) {
        System.out.println("Enter width:");
        final int width = scan.nextInt();
        System.out.println("Enter height:");
        final int height = scan.nextInt();
        System.out.println("Area: " + width * height);
        System.out.println("Perimeter: " + 2*(width+height));
    }
  }
}