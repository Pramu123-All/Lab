package Q13;
import javax.swing.*;
class SampleWindow {
    public static void main(String[] args) {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(500, 250);
        myWindow.setTitle("UOK");
        myWindow.setVisible(true);
        
            int i=0;
            while (i<5){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                myWindow.setVisible(false);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                myWindow.setVisible(true);
                i += 1;
            }

        }
    }
