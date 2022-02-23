package com.company;
import java.util.Scanner;
public class Practise_Set_07 {
    //Q1)write a java method to to print multiplication table of a number n.
    static void table(int n){
        System.out.println("The table of "+n);
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    /*Q2)Write a programme using function to drae following pattern
    *
    **
    ***
    ****
     */
    static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    //Q3)Write a recursive method to calculate sum of first n natural numbers.
    static int Sum(int n){
        int result;
        if(n==1){
            return 1;
        }
        else {

            result = n + Sum(n - 1);
            return result;
        }
    }

    /* Q5)Write a method to print the follwing pattern
    ****
    ***
    **
    *
     */
    static void pattern2(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<= i;j++){
                System.out.print("*"+"\t");

            }
            System.out.print("\n");
        }
    }

    //Q5)write a programme to find the nth term of fibonacci series.
    static int fibo(int n){
        int res;
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
          res=fibo(n-1)+fibo(n-2);
          return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Write the number whose table you want ");
        //int n= sc.nextInt();
        //table(n);
       // pattern(n);
        /*
        System.out.println("Enter the number up to you want the sum: ");
        int a= sc.nextInt();
        int c=Sum(a);
        System.out.println("The sum of "+a+" natural numbers is "+c);
        */
       // pattern2(5);
        /*
        System.out.println("Enter the number of term you want in fibonacci series ");
        int inp= sc.nextInt();
        int res=fibo(inp);
        System.out.println("The "+inp+"th term in fibonacci series is "+res);
        */







    }
}
