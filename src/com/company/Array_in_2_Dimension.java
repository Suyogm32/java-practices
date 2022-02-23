package com.company;
import java.util.Scanner;
public class Array_in_2_Dimension {
    public static void main(String[] args) {
        //Declaring a 2-D array
        int [][] flats=new int[3][5];
        int i=0;
        int j=0;
        while(i<=3) {
            while(j<=5) {
                System.out.println("Enter the element:-");
                Scanner sc = new Scanner(System.in);
               flats[i][j]=sc.nextInt();
               if(j==5)
               break;
               j++;
            }
            i++;
        }



        for( i=0;i<=3;i++) {
            for(j=0;j<=5;j++) {

                System.out.println(flats[i][j]);
            }
        }
    }
}
