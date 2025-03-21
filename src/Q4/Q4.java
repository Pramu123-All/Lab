package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input the Weight ");
        float weight =scanner.nextInt();
        float calories=weight*19;

        System.out.println("The number of calories needed to maintain weight is "+calories);
    }
}
