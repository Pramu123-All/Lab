package Q7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today=new Date();
        sdf=new SimpleDateFormat("HH:mm:ss a");
        System.out.println(sdf.format(today));
    }
}
