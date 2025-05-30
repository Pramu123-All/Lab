package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Words");
        String input=scanner.nextLine();
        int index=input.indexOf("!");

        if (index != -1){
            String firstPart=input.substring(0,index).trim();
            String secondPart=input.substring(index+1).trim();
            System.out.println(firstPart);
            System.out.println(secondPart);
        }


    }
}
