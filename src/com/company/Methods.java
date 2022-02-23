package com.company;

public class Methods {
    //This function dose not returns anything thus it have void argument.
    static void greet(){
        System.out.println("Hello Gentelman !"+"Welcome to new world!");
    }
     static int function(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else
            z=(x+y)/2;
        return z;
    }
    public static void main(String[] args) {
        /*Methods are the functions which defined in class.
        These are used for repeating same work/calculations on different data.
        for example
         */

        int a=4;
        int b=5;
        int c;
        if(a>b){
            c=a+b;
        }
        else
        c=(a+b)/2;
        System.out.println("The value of c is ");
        System.out.println(c);
        // if we want to do similar process on different values for example
        int a1=6;
        int b1=8;
        int c1;
        if(a>b){
            c1=a1+b1;
        }
        else
            c1=(a1+b1)/2;
        System.out.println("The value of c1 is ");
        System.out.println(c1);
        //this makes code lengthy and inefficient for use hence we use the method to do same operation on different values.
        //For example this will be return as
        int a2=5;
        int b2=4;
        int c2=function(a2,b2);
        System.out.println("The value of c2 is ");
        System.out.println(c2);
        //if we use above syntax then non static methods are not called by this syntax
        int a3=6;
        int b3=8;
        //By using this syntax we can call non static method in static method.
        Methods obj=new Methods();//First we have to create an object of  given class.
        int c3=obj.function(a3,b3); //Then we can call method as object.method_name(parameters);
        System.out.println("The value of c3 is ");
        System.out.println(c3);
        greet();
    }
}
