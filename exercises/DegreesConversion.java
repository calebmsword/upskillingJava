import java.util.Scanner;
import java.lang.Math;

class DegreesConversion {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    boolean noAnswerGiven = true;
    String answer = "";

    // query triangle or rectangle
    while(noAnswerGiven) {
      System.out.println("F to C (F/f) or C to F (C/c)?");
      answer = scan.nextLine();
      if (answer.equalsIgnoreCase("F") || answer.equalsIgnoreCase("C")) {
        noAnswerGiven = false;
      } else {
          System.out.println("Please enter F, f, C, c.");
      }
    }
    
    // F to C
    if (answer.equalsIgnoreCase("F")) {
        System.out.println("Enter degrees Fahrenheit:");
        final int degrees = scan.nextInt();
        System.out.println("In Celcius: " + (degrees-32)*(5./9.));
    }

    // C to F
    if (answer.equalsIgnoreCase("C")) {
        System.out.println("Enter degrees Celcius:");
        final int degrees = scan.nextInt();
        System.out.println("In Fahrenheit: " + (degrees*(9./5.) + 32));
    }
  }
}