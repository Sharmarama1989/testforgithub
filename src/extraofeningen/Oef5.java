package extraofeningen;

import javax.swing.*;
import java.util.Arrays;

public class Oef5 {
    public static void main(String[] args) {
        int howmany=Integer.parseInt(JOptionPane.showInputDialog("howmany num"));
        int begingetal=Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));

        boolean min=true;
        for (int i = 0; i <=howmany ; i++) {
            System.out.println(begingetal + " ");

            if (min) {
                begingetal -= 2;
                min = false;
            } else {
                begingetal++;
                min = true;
            }
        }
    }
}
