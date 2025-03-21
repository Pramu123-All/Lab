package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input the radius ");
        float radius =scanner.nextFloat();

        final double pi = 3.14;
        float volume= (float)((4.0/3.0)*(pi*radius*radius*radius));
        System.out.println("The volume of the sphere is "+volume);





    }
}
