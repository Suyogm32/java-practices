package com.company;

public class Loops_while_loop {
    public static void main(String[] args) {
        //Printing number from 1 to 10 using while loop.

/*        while (i<=100){

            while(j<=i) {
                if (i %j==0 )
                    System.out.print(i + "\t");
            j++;
            }

            i++;

        }
 */
        /*
        //Practice problem statement print natural numbers between 100 and 200
        int j=100;
        while (j<=200){
            System.out.println(j);
            j++;
        }
        */

        /*
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        */


        /*
        //Decremintaing for loop
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        */

        /*
        // Breaking the loop
        //Breaking means simply loop breaks at given condition in if
        for(int l=0;l<=5;l++){
            System.out.print(l);
            System.out.println(" Java is great!");
            if(l==3)
            {
                System.out.println("Breaking the loop!");
                break;
            }
            */

            //Continuining in loop
            //It means when given condition met it simply moves to next iteration from that step
            for(int l=0;l<=5;l++){
                System.out.print(l);
                System.out.println(" Java is great!");
                if(l==3)
                {
                    System.out.println("continuppppppppppppppp0ing the loop!");
                    continue;
                }
        }

    }
}
