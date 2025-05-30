package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Width");
        int Width= Integer.parseInt(scanner.next());


        System.out.println("Enter Height");
        int Height=Integer.parseInt(scanner.next());
        System.out.println(Height);


        System.out.println("Enter Title");
        scanner.nextLine();
        String Title=scanner.nextLine();

        JFrame frame=new JFrame();
        frame.setSize(500,800);
        frame.setVisible(true);
        frame.setTitle(Title);

    }
}
