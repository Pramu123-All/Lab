package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");

        double celsius=scanner.nextDouble();
        Temperature t1=new Temperature(celsius);
        System.out.println("Temperature in Celsius: "+t1.tocelsius());
        System.out.println("Temperature in Fahrenheit: "+t1.toFahrenheit());

        System.out.println("Enter the temperature in Fahrenheit: ");
        double  inputFahrenheit=scanner.nextDouble();
        Temperature t2=new Temperature();
        t2.setFahrenheit(inputFahrenheit);

        System.out.println("Temperature in Celsius: "+t2.tocelsius());







    }
}
