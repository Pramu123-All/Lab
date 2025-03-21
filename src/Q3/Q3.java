package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System .out.println("Enter the value in Celsius:");
        double celsius=scanner.nextDouble();


        double fahrenheit=(1.8*celsius)+32;
        System.out.println("Fahrenheit "+fahrenheit);
    }
}
