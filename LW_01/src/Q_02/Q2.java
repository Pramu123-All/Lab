package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName;
        System.out.println("Enter first name");
        firstName=scanner.next();

        String secondName;
        System.out.println("Enter Second name");
        secondName=scanner.next();

        JFrame Frame=new JFrame();
        Frame.setTitle(firstName+" "+secondName);
        Frame.setVisible(true);
        Frame.setSize(800,600);
    }
}
