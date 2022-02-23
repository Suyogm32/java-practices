package com.company;
import java.util.Scanner;
public class Practise_Set_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*
        //Q2)Write programme on grades of students
        System.out.println("Enter the marks of Subject 1:-");
        int sub1=sc.nextInt();
        System.out.println("Enter the marks of subject 2:-");
        int sub2=sc.nextInt();
        System.out.println("Enter the marks of subject 3:-");
        int sub3=sc.nextInt();
        float percentage=(sub1+sub2+sub3)/3;
        System.out.println("Your overall percentage is "+percentage);
        if(percentage>=40){
            if(sub1>33 && sub2>33 && sub3>33){
                System.out.println("Student is pass");
            }
            else{
                System.out.println("Student failed");
            }
        }
        else{
            System.out.println("Student Failed.");
        }

         */

        /*
        //Q3)Calculating income tax
        float tax;
        System.out.println("Enter your income");
        int income=sc.nextInt();
        if(income>250000 && income<=500000){
            tax=0.05f*(income-250000);
            System.out.println("Your income tax is "+tax);
        }
        else if(income>500000 && income<1000000){
            tax=0.05f*(250000);
            tax=tax+0.2f *(income-500000);
            System.out.println("your income tax is "+tax);
        }
        else if(income>1000000){
            tax=0.05f*(250000)+0.2f*(500000);
            tax=tax+0.3f*(income-1000000);
            System.out.println("Your income tax is "+tax);
        }
        else{
            System.out.println("Your income tax is 0");
        }
        */

        /*
        int num=sc.nextByte();
        switch (num) {
            case 1 -> System.out.println("It's Monday for you!");
            case 2 -> System.out.println("It's Tuesday!");
            case 3 -> System.out.println("It's Wednesday !");
            case 4 -> System.out.println("It's Thursday!");
            case 5 -> System.out.println("It's Friday!");
            case 6 -> System.out.println("It's Saturday!");
            case 7 -> System.out.println("It's Sunday!");
            default -> System.out.println("Please enter the correct choice");
        }
         */

        /*
        //Q5)Check whether year given by user is leap year or not.
        int year= sc.nextInt();
        int lyear=year%4;
        if(lyear==0){
            System.out.println("The year you given is leap year ");
        }
        else{
            System.out.println("THe year is not a leap year.");
        }
        */


        System.out.println("Enter your website url:-");
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("This website belongs to organization.");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website.");
        }
        else if(website.endsWith(".in")){
            System.out.println("The website is indian");
        }


    }
}
