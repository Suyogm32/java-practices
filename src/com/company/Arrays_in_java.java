package com.company;

import java.util.Arrays;

//Problem Statement-
//You have to store marks of 500 students.
public class Arrays_in_java {
    public static void main(String[] args) {
        /*
        //The index of array starts from 0 to n-1 and n is size of array.
        //Syntax of declaring of array
        int [] marks=new int[10];
        // datatype [] name_of_array = new datatype[declaration of space];
        //initialization
        marks[0]=90;
        marks[1]=40;
        marks[2]=78;
        marks[3]=54;
        marks[4]=60;
        System.out.println(marks[4]);
        */

        /*
        //There are 3 ways to declare a  array are as follows-
        1) int [] marks;  -> Declaration of array
           marks=new int[10]; -> Memory allocation

        2nd method
        int [] marks=new int[10];  -> Declaration of array+Memory Allocation

        3rd Method
        int [] marks={90,40,78,54,60}; Declaration+initializing of array
         */
        int [] marks={90,40,78,54,60};
        System.out.println("Displayb the marks");
        for(int j=0;j< marks.length;j++){
            System.out.print(marks[j]+"\t");
        }

        //Finding length of an array
        System.out.println(marks.length);
        //System.out.println(Arrays.stream(marks).max(50>marks[4]));

        //Array of strings
        String [] student={"Ram","Jay","Vijay","Alex","Luffy","Zoro"};
        System.out.println(student[4]);
        System.out.println(student.length);

        //Method to display the array
        System.out.println("Displyaing the  Student array");
        for(int i=0;i<student.length;i++){
            System.out.print(student[i]+"\t");
        }

        System.out.println("\n");
        //Printing the elements in array in reverse order
        System.out.println("Student array in reverse order");
        for(int l= student.length-1;l>=0;l--){
            System.out.print(student[l]+"\t");
        }

        //Displaying elemnts in array using for-each loop
        System.out.println("\n"+"Displaying elements in array in using for-each loop");
        for(int element:marks){
            System.out.print(element+"\t");
        }



    }
}
