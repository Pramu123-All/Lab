package Q_01;

public class Q_01 {
    public static void main(String[] args) {

        //a
        int B=2,A=5,C=3;
        double resultA=Math.sqrt((B * B)+ 4 * A * C);
        System.out.println("Answer=" +resultA);

        //b
        int x=5,Y=3;
        double resultB=Math.sqrt(x + 4 * Y * 3);
        System.out.println("Answer=" +resultB);

        //c
        double resultC=Math.cbrt(x*Y);
        System.out.println("Answer=" +resultC);

        //d
        int r=5;
        double resultD=Math.PI*Math.pow(r,2);
        System.out.println("Answer=" +resultD);


    }
}
