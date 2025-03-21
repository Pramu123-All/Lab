package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input the count of dollars ");
        double P=scanner.nextFloat();

        System.out.println("input the rate");
        double R=scanner.nextFloat();

        System.out.println("input the number of years ");
        double N=scanner.nextFloat();

        double A= P *Math.pow((1+R/100),N);

        System.out.println("After "+N+" years at "+R+"%, the investment will be worth $"+A);

    }
}
