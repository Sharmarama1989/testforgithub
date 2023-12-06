package whileloops;

import javax.swing.*;

public class Oef2 {
    public static void main(String[] args) {
        int grootste = Integer.parseInt(JOptionPane.showInputDialog("Geef een grootste"));
        String input=JOptionPane.showInputDialog("Geef een getal in");
        while (!input.equals("STOP")) {

            int getal = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Geef een getal in");
            System.out.println("Getal are: "+getal);
            if (getal > grootste) {
                grootste = getal;
            }
        }

        System.out.println("Grootste is :"+grootste);
        JOptionPane.showMessageDialog(null,"Grootste is :"+grootste);

    }
}
