package com.company;

public class Harry {


    public static void main(String[] args) {
        // Practice Problem 1 decreasing triagle
        int z= 4;
        for (int i=z; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Practice Problem 2 sum of first 4 even numbers
        int sum=0;
        int n=4;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        // Practice Problem 3(multiplication of three)
        int k = 5;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n", k, i, k*i);
        }
        System.out.println();
        // Practice Problem 4
        int r = 10;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n", r, i, r*i);
        }
      /*  int num=5;
        int a=1;
        int factorial=1;
        while (a<=num){
            factorial*=a;
            a++;

        }
        System.out.println("factorial: "+factorial);
*/


        // Practice Problem 6 factorial
        int f = 5;
        // What is factorial n = n * n-1 * n-2 ..... 1
        // 5! = 5*4*3*2*1 = 120
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

        // Practice Problem 9
        int e = 8;
        int sum2 = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int j=1;j<=10;j++){
            sum2 += e*i;
        }
        System.out.println(sum2);




    }

}

