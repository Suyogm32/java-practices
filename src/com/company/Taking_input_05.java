package com.company;
import  java.util.Scanner;
public class Taking_input_05 {
    public static void main(String[] args){
      System.out.println("It works");
      Scanner sc=new Scanner(System.in);  //Because of this line we create a new object of class Scanner
        // .In this case our object is 'sc'.
        System.out.println("Enter the  first number ");
       // int a=sc.nextInt();  //With use of this we can get input form user as an integer.
        float a=sc.nextFloat();    //from this we get float number as input.
        boolean b1= sc.hasNextFloat(); //This is to check whether the input is accepted or not.
        // It gives value 'true' if user give correct input of given data type, otherwise it gives value 'false'.
        System.out.println(b1);
        System.out.println("Enter the  Second  number ");
        //int b=sc.nextInt();
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.print("Sum of given numbers is ");
        System.out.print(sum);
        /*
        string str=sc.next();     //This is  get input form user in this case only one word is read out of whole sentence.
         for eg. if input is 'Let,s learn java.' then it only reads 'Let's'
         string str=sc.nextLine();  //This line takes whole line as input.For eg. It reads whole as'Let's learn java.'
        System.out.println(str);
        */

    }
}
