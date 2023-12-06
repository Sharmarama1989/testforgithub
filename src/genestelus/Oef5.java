package genestelus;

import javax.swing.*;

public class Oef5 {
    public static void main(String[] args) {
        int aantal = Integer.parseInt(JOptionPane.showInputDialog("Geef een anntal"));
        while  (aantal>0) {
           aantal = Integer.parseInt(JOptionPane.showInputDialog("Geef een anntal"));
            if (aantal<=0){
                System.out.println("stop");
            }
            double sum = 0;
            for (int i = 0; i < aantal; i++) {
                int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
                System.out.println("Getal "+(i+1)+": "+ (i+1));
                sum += getal;



            }
            System.out.println("Sum is ="+sum);
            System.out.println("Avg is ="+sum/aantal);

        }

    }
}
