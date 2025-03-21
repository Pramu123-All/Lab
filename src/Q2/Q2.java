package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value in CentiMeeters:");
        double centiMeters=scanner.nextDouble();
        double inches=centiMeters/2.54;
        double feet=inches/12;

        System.out.println("Feet "+feet+" Inches "+inches);
    }
}