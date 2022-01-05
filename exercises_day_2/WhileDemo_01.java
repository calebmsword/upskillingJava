import java.lang.Math;

public class WhileDemo_01 {
  public static void main(String[] args) {
    int loan = 10000;
    int emi = 1000;
    int interest = 10; 

    int no_emis = 0;
    while( loan > 0 ){
      loan -= emi;
      no_emis ++ ;
      loan += (interest/100.)*loan;
      System.out.println("Paying "+emi+ " of the installment "+no_emis+" ("+Math.max(0,loan)+" dollars remain)");
    }

    System.out.println("You are free from the loan after "+no_emis+" installments have been paid");
  }
}