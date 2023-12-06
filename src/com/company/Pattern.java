package com.company;

public class Pattern {
    public static void main(String[] args) {
        // Practice Problem 1
        int m = 4;
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println(" ");

        }
        for (int i = 1; i <=4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("2nd");
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j<=4; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
