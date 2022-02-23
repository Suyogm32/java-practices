package com.company;

public class Method_Overloading {
    static void greet(){
        System.out.println("Hello Gentleman !"+"Welcome to new world!");
    }
    static void change(int x){
        x=100;
    }
    static void change1(int [] arr){
        arr[0]=97;
    }
     static void foo(){
         System.out.println("Good Morning Sir!");
     }
    static void foo(int a){
        System.out.println("Good Morning Sir!"+" \n Your Order number is "+a);
    }
    static void foo(int a,int b){
        System.out.println("Good Morning Sir!"+" \n Your Order number is "+a+" for "+b+" people");
    }



    public static void main(String[] args) {
       // greet();

        //Before going to method overloading we have to know something.
        //Important Note: In case of arrays the reference is passed. Same is the case for object passing to methods.
        //Let's know the meaning of above sentence by an example
        int x=78;
        change(x);
        System.out.println("Changed value of x is:"+x);
        /*
        In this case value of x is not going to change because in this case static method is called in static method and
        the copy of x is passed in change() method so there will not be any change in value of x in main  method.
         */

        int [] marks={78,89,93,88,80,95};
        change1(marks);
        System.out.println("The change in value at position marks[0] is "+marks[0]);
        /*
        In this case value at marks[0] is changed because when we passed 'marks' as an argument in change1() method
        it dose not passes copy marks[] but it passes reference of array i.e. marks
        thus reference passed in change1() method and reference of array is pointing the same thing or memory location
        change in change1() method impacts in main function too
        thus in case of array value is changes in it although the data type of method is void.
         */

        //Let's move towards the method overloading
        foo();
        System.out.println("Method overloading ");
        foo(12);
        System.out.println("Method Overloading!");
        foo(12,3);
        /* In this method overloading we can change no of parameters by keeping the method name same
        and we can also change the body of method, thus it becomes 2 different methods with same name.
        Only changing the return type(data type) of method dosen't cause any method overloading.
         */

        //As we seen method overloading we can do it by using variable arguments

    }
}
