package genestelus;

import javax.swing.*;

public class Oef6 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));//4
        int i = 1;
        int factorial = 1;
        while(i<=getal){
            factorial *= i;
            i++;
        }
        System.out.println("faculteit van "+getal +" is = "+factorial);

    }
    }

