package Q3;

import javax.swing.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String firstName;
        System.out.println("Enter first Name");
        firstName=scanner.next();

        String middleName ;
        System.out.println("Enter Middle Name ");
        middleName=scanner.next();

        String  lastName;
        System.out.println("Enter Last Name");
        lastName=scanner.next();

        JFrame frame= new JFrame();
        frame.setTitle(firstName+" "+(middleName.charAt(0))+". "+lastName);
        frame.setVisible(true);
        frame.setSize(300,500);

    }
}
