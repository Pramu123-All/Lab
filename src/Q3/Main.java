package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the radius of the  middle circle: ");
        double ri=scanner.nextDouble();
        System.out.println("Enter the radius of the outer circle: ");
        double ro=scanner.nextDouble();

        Circle c1= new Circle(ri);
        Circle c2= new Circle(ro);
         double area = c2.computeArea()-c1.computeArea();

         System.out.println("Area of the ring: "+area);



        System.out.println("Circumference of inner Circle:"+c1.computeCircumference());
        System.out.println("Circumference of outer Circle:"+c2.computeCircumference());


    }
}
