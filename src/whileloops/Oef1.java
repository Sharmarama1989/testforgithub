package whileloops;

import javax.swing.*;

public class Oef1 {
    public static void main(String[] args) {
        int aantal=Integer.parseInt(JOptionPane.showInputDialog("Geef een aantal"));
        int product=1;
        String input=JOptionPane.showInputDialog("Geef een getal in");
        while (!input.equals("STOP"))
        {
            product*=aantal;
            int getal = Integer.parseInt(input);
            input=JOptionPane.showInputDialog("Geef een getal in");
        }
        System.out.println("Product is:"+product);
        JOptionPane.showMessageDialog(null,"Product is :"+product);
    }
}
