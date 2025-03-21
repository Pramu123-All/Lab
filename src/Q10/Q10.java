package Q10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("input the loan amount ");
        float loanAmount =scanner.nextFloat();

        System.out.println("input the annual interest rate ");
        float annualInterestRate =scanner.nextFloat();

        System.out.println("input the number of years ");
        float numberOfYears =scanner.nextFloat();

        float monthlyInterestRate = (float) (annualInterestRate/100.0/12.0);
        float numberOfPayment=numberOfYears*12;
        float monthlyPayment = (float) (loanAmount*monthlyInterestRate/(1-Math.pow(1+monthlyInterestRate,-numberOfPayment)));
        float totalPayment = monthlyPayment*numberOfPayment;

        System.out.println("The monthly payment is $"+monthlyPayment);
        System.out.println("The total payment is $"+totalPayment);




    }
}
