package com.company;
import java.util.Scanner;
public class Practise_Set_06 {
    public static void main(String[] args) {
        /*
        //Q1)Create an array of an 5 floats and calculate their sum
        float [] arr={2.0F,4.5F,3.7F,5.3F,5.5F};
        float sum=0F;
        for(int i=0;i<= arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        */

        /*
        //Q2)Write a programme for to find out whether the given integer is present in an array or not
       int [] arr1={12,34,76,86,43,56};
        Scanner sc=new Scanner(System.in);
        boolean check=false;
        System.out.println("Enter the number that you want to find in array:-");
        int n=sc.nextInt();
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]==n){
               check=true;
               break;
            }
        }
        if(check==true){
            System.out.println("Given number is found in array!");
        }
        else {
            System.out.println("Given number is not in array!");
        }
        */


        /*
        //Q3)Calculate the average marks from an array containing marks of all students in physics using for each loop.
        int [] marks={78,67,98,92,95,87};
        int sum=0;
        for (int element:marks) {
            sum=sum+element;
        }
        System.out.println("Average marks in physics "+(sum/ marks.length));
        */

        /*
        //Q4)Create a java programme to add 2 matrices of size 2*3.
        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{7,8,9},{0,10,11}};
        int [][] sum=new int[2][3];
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                sum [i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Sum of 2 matrices is ");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                System.out.print(sum [i][j]+"\t");
            }
            System.out.print("\n");
        }
        */

        //Q5)Write a java programme to reverse an array.

        /*
        int [] array=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=array.length-1;i++){
            System.out.println("Enter the element in array");
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array is ");
        for(int element:array){
            System.out.print(element+"\t");
        }
        System.out.println("Reverse of above array is ");
        int [] n_arr=new int[array.length];
        for(int j=0;j<= array.length-1;j++){

        for(int i= array.length-1;i>=0;i--){
            System.out.print(n_arr[j]=array[i]);
            System.out.print("\t");
        }
        }
        //This method is not efficient.
        */

        /*
        int [] array=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=array.length-1;i++){
            System.out.println("Enter the element in array");
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array is ");
        for(int element:array){
            System.out.print(element+"\t");
        }

        System.out.println("\n");
        System.out.println("Reverse of an array is ");
        int temp;
        for(int i=0;i<=Math.floorDiv(array.length,2);i++){
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
        for(int element:array){
            System.out.print(element+"\t");
        }
        */

        /*
        //Q6)Find maximum element in array.
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<= arr.length-1;i++){
            System.out.println("Enter the elements in array ");
             arr[i] =sc.nextInt();
        }
        int max=0;
        for (int j=0;j<= arr.length-1;j++){
            if(max<=arr[j]){
                max=arr[j];
            }
        }
        System.out.println("Maximum element in array is "+max);
        */
        /*

        //Q7)Find minimum element in array.
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<= arr.length-1;i++){
            System.out.println("Enter the elements in array ");
            arr[i] =sc.nextInt();
        }


        int min=arr[0];
        for (int k=0;k<= arr.length-1;k++){
            if(min>=arr[k]){
                min=arr[k];
            }
        }
        System.out.println("Minimum element in array is "+min);
        */

        //Q8)Write  a java programme whether a array is sorted or not.
        int [] arry={12,23,34,45,56,67,78};
        boolean check=true;
        for(int i=0;i<= arry.length-2;i++){
            if(arry[i]>arry[i+1]){
                check=false;
                break;
            }
        }
        if(check==false){
            System.out.println("Array is not sorted!");
        }
        else{
            System.out.println("Array is  sorted!");
        }

        }



    }


