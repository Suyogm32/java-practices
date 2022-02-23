package com.company;

public class Variable_Arguments {
    //As we seen method overloading we can do it by using variable arguments
    //As we do not want declare different methods for different number of arguments.
    //We know as follows we declare foo1(),foo1(int a),foo(int a,int b) but it can replace with only 1 function with variable arguments.

    static void foo1(){
        System.out.println("Good Morning Sir!");
    }
    static void foo1(int a){
        System.out.println("Good Morning Sir!"+" \n Your Order number is "+a);
    }
    static void foo1(int a,int b){
        System.out.println("Good Morning Sir!"+" \n Your Order number is "+a+" for "+b+" people");
    }
    static void foo1(int ... arr){
        System.out.println(arr);
    }


    public static void main(String[] args) {

        foo1();
        System.out.println("Method overloading ");
        foo1(12);
        System.out.println("Method Overloading!");
        foo1(12,3);
        foo1(12,34);


    }
}
