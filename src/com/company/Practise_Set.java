package com.company;
import java.util.Scanner;


public class Practise_Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        //Q1)Write a programme for convert uppercase string into lower case.
        String name="SUYOG";
        System.out.println(name.toLowerCase(Locale.ROOT));
        */

        /*
        //Q2) Replace blank spaces in string with underscore.
        String spaced_text="This is practice set.";
        System.out.println(spaced_text.replace(" ","_"));
        */

        /*
        // Q3)
        String text="Dear <|Name|> Thanks a lot!";
        String name=sc.next();
        System.out.println(text.replace("<|Name|>",name));
        */

        /*
        //Q4)Write a programme to detect double and triple spaces in a string.
        String detect_text="Suyog is  a  good boy.";
        System.out.println(detect_text.contains("  "));
        System.out.println(detect_text.contains("   "));
        */

        //Q5)Write a programme for format the following letter using escape Sequence Character
        String letter="Dear Suyog,This Java course is nice.Thanks!";
        System.out.println("String before using escape sequence character:-");
        System.out.println(letter);
        String letter1="Dear Suyog,\n\tThis \'Java\' course is nice.\n\tThanks!";
        System.out.println("String After using escape sequence character:-");
        System.out.println(letter1);




    }
}
