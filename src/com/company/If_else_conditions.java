package com.company;
import java.util.Scanner;
public class If_else_conditions {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     /*
     System.out.println("Enter your age:-");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Yes,you can drive!");
        }
        else{
            System.out.println("Sorry you are not permitted to drive.");
        }
        */

        //Logical operators and relations
        System.out.println("Logical AND....");
        boolean a=true;
        boolean b=false;
        //boolean c=true;
        if(a && b ){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }



        System.out.println("Logical OR....");
        //boolean c=true;
        if(a || b ){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("Logical NOT...");
        System.out.println("NOT(a) is "+!a);
        System.out.println("NOT(b) is "+!b);
        

    }

}
