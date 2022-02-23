package com.company;
import java.util.Scanner;
public class else_if_and_switchcase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age ");
        int age=sc.nextInt();


        if(age>56){
            System.out.println("You are experienced person.");
        }
        else if (age>46){
            System.out.println("You are semi-experienced" );
        }
        else if (age>36){
            System.out.println("You are partially experienced");
        }
        else{
            System.out.println("You are roorkie");
        }




    }
}
