package Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name in first middle last");
        String name = scanner.nextLine();

        String[] parts=name.split(" ");

        String first=parts[0];
        String middle=parts[1];
        String last=parts[2];

        System.out.println(last+","+first+" "+middle.charAt(0)+".");


    }
}