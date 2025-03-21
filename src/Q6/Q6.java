package Q6;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        GregorianCalendar cal=new GregorianCalendar();
        int currentyear=cal.get(GregorianCalendar.YEAR);

        Scanner scanner=new Scanner(System.in);
        System.out.println("input the year you were born ");
        int birthyear=scanner.nextInt();
        int age=currentyear-birthyear;

        System.out.println("You were born in "+ birthyear +"and will be "+age+" this year");

    }

}
