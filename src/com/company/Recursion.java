package com.company;
import java.util.Scanner;
public class Recursion {
    static int factorial(int n){
        int fact;
        if(n==0 || n==1){
            return 1;
        }
        else  {
            fact = n * factorial(n - 1);
            return fact;
        }

    }
    static int fibonnaci(int n){
        int result;

            if(n>=3) {
                result = fibonnaci(n) + fibonnaci(n - 1);
                return result;
            }
            else if(n==2){
                return 1;

            }
            else {
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want ");
        int n= sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
        System.out.println("Factorial of "+n+" is "+factorial(n+1));
        System.out.println(fibonnaci(n));
    }
}
