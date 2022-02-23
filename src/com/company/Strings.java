package com.company;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        /*
        //String name=new String("Suyog");
        String name="Suyog is good boy.";
        // by using above 2 methods we can declare  the string.
        // Strings are immuatable means they can not be changed after declaration.
        System.out.println(name);
        //New method for printing output on screen. printf() method same as like as c++.
        int a=5;
        float b=4.5672f;
        System.out.printf("The value a of is %d and b is %f ",a,b);
        // %d -> int ,%f -> float,%c -> char,%d ->double , %s ->String are the format specifiers for given data type.
         System.out.format("The value of a is %d and b is %f",a,b);
         // This also printing method as like above using format specifiers.
        //String can be input by user,a follows:-
        */
        Scanner sc=new Scanner(System.in);
        //String str=sc.next(); //This sc.next() reads only one word if user gives sentence as input.
        String str=sc.nextLine();
        System.out.println(str);
    }
}
