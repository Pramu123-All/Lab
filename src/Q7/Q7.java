package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input the Weight ");
        int weight =scanner.nextInt();


        System.out.println("input the Height ");
        int height =scanner.nextInt();

       float heightInMeters = (float) height / 100;
       float bmi = weight / (heightInMeters * heightInMeters);

         System.out.println("Body Mass Index is "+bmi);
    }
}
