package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input temperature in degree Fahrenheit ");
        float fahrenheit =scanner.nextFloat();

        float celsius =((float) 5 /9)*(fahrenheit-32);
        System.out.println("Temperature in degree Celsius is "+celsius);

    }
}
