package com.company;

public class Associativity_of_Operators {
    public static void main(String[] args){
        int a=5;
        int b=6+a-9;
        System.out.println(b);

        int c=5*6-27/3;
        int d=5/6-27*3;
        /*Here we have less precedence for'-' than '*' and '/'  these operators.*/
        System.out.println(c);
        System.out.println(d);
        int m=(5+67)-(512/8)*2+4;
        System.out.println(m);
        /*The precedence for operators is as below
        '-'='+'<'*'='/'<()->
        paranthese have highest precedence.
        Comma have least precedence.
        Most of the operators evaluate  from left to right.
        but 1) Assignment operators like '=','+=','-='
             2) Logical Not operator '!'
             3)Increment Operator '++'
             4)Decrement Operator '__'
             5) 'sizeof' Operator
             6) Address of  Operator '%'
             7) Unary Minus '-'
             8) Indirective '.'
             are operates from right to left.
         */
    }
}
