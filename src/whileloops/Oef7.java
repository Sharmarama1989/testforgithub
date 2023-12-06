package whileloops;

import javax.swing.*;

public class Oef7 {
//    public static void main(String[] args) {
//       int eerstegetal=Integer.parseInt(JOptionPane.showInputDialog("geef eerste getal"));
//        int tweedegetal=Integer.parseInt(JOptionPane.showInputDialog("geef eerste getal"));
//        int derdegetal=Integer.parseInt(JOptionPane.showInputDialog("geef eerste getal"));
//
public static void main(String[] args) {
    // TODO code application logic here
    String spaarbedragString
            = JOptionPane.showInputDialog("Hoeveel wil je sparen?");
    String rentevoetString
            = JOptionPane.showInputDialog("Welke rentevoet heb je verkregen?");
    String doelString
            = JOptionPane.showInputDialog("Hoeveel moet je spaargeld opbrengen?");
    double spaarbedrag = Double.parseDouble(spaarbedragString);
    double rentevoet = Double.parseDouble(rentevoetString);
    double doel = Double.parseDouble(doelString);
int jaar=0;
double bedrag=spaarbedrag;
    while (bedrag < doel){
        //bedrag=bedrag*(1+rentevoet);
        bedrag=bedrag+bedrag*rentevoet;

        System.out.println("Jaar "+ jaar+":"+bedrag);
        jaar++;
    }
    System.out.println("Voor een bedrag van " +doel+" euro ,moet je dus "+ jaar +"jaar sparen");
}
    }

