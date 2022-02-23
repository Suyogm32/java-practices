package com.company;

public class Loops_do_while_loop {
    public static void main(String[] args) {
        int i=0;
        /*
        do{
            System.out.println(i);
            i++;
        }while(i<5);
        */

        /*
        System.out.println("Breaking the do-while loop");
        do{
            System.out.println(i);
            i++;
            if(i==3){
                System.out.println("Do-while loop breaks at "+ i);
                break;
            }
        }while(i<5);
        */

        System.out.println("Continuing the do-while loop");
        do{
            System.out.println(i);
            i++;
            if(i==3){
                System.out.println("Do-while loop continues at "+ i);
                continue;
            }
        }while(i<5);



    }
}
