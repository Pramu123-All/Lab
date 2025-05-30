package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Word");
        String word=scanner.nextLine();

       int count= word.length();


       if (count % 2 != 0){
           int middleIndex=count/2;
           System.out.println(word.charAt(middleIndex));

       }

    }
}
