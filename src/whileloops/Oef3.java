package whileloops;

import javax.swing.*;

public class Oef3 {
    public static void main(String[] args) {
        int begin =Integer.parseInt(JOptionPane.showInputDialog("Geef een begin waarde"));
        int eindewaarde =Integer.parseInt(JOptionPane.showInputDialog("Geef een einde waarde"));
while (eindewaarde<begin+50){
    eindewaarde =Integer.parseInt(JOptionPane.showInputDialog("Geef een einde waarde"));
}
       int i =1;
while (i*begin<=eindewaarde ) {
    System.out.println(i*begin);
i++;

        }

    }
}
