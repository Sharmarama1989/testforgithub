package whileloops;

import javax.swing.*;

public class Oef6 {
    public static void main(String[] args) {
        int getal=Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
        int som=0;
        while (getal>0){
            int rest=getal%10;
            som+=rest;
            getal=getal/10;
        }
        System.out.println(som);
    }
}
