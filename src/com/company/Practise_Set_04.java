package com.company;
import java.util.Scanner;
public class Practise_Set_04 {
    public static void main(String args[]){
        /*
        /*
        //Q1)Write a programme to print the pattern
        //****
        //***
        //**
        //*


        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++)
            System.out.print("*");
            System.out.print("\n");
        }
        */

        /*
        //Q2)Write a programme for to print the sum of all even number upto n.
        int n=10;
        int sum=0;
        for(int i=0;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println("The Sum of first even "+ n +" natural number is "+sum);
        */

        /*
        //Q3)Write the programme  for the table of certain number.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want:-");
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        */

        //Q4)Find the factorial of given number.
        /*
        //A)using For loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want:-");
        int n= sc.nextInt();
        System.out.println("Factorial of given number is ");
        int fact=1;
        for( int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("\t"+fact);
        */

        /*
        //B)using while loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want:-");
        int n= sc.nextInt();
        System.out.println("Factorial of given number is ");
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.print("\t"+fact);
        */

        /*
        //Q)Write the programme  for the table of certain number.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want:-");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+n*i;
        }
        System.out.println("Sum of numbers in table of given number is "+sum);
        */

    }
}
