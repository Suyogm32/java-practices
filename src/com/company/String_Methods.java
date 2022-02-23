package com.company;
import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args){

        String name="Suyog";
        /*
        System.out.println(name);
        // finding length of String.
        int len=name.length();
        System.out.println("Length of given string is "+len);
         */

        /*
        Covert String to lower case
         String lstring=name.toLowerCase();
        System.out.println(lstring);
        */

        /*
        Convert String to upper case
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        */

        /*To trim the string(It removes blank spaces from start of string and at the end of String.)
        String str="   Suyog is good boy.   ";
        System.out.println(str);
        String trimmed_string=str.trim();
        System.out.println(trimmed_string);
        */

        /*
        //Substring method - It prints whole sting after given starting index.
        // In this case starting index is 2 so it prints 'yog' from whole string 'Suyog'.
        String sub_string=name.substring(1);
        System.out.println(sub_string);
        //This another type of substring in which we can give both start index and end index.
        //But Start index is included and end index is excluded.
        String sub_string2=name.substring(0,3);
        System.out.println(sub_string2);
        */

        /*
        //name.replace() - This method is used for replacing a character from string by given letter.
        String replaced_string=name.replace('u','n'); // This replace char with char.
        System.out.println(replaced_string);
        String replaced_string2=name.replace("uyog","neha");//this replace string with string.
        System.out.println(replaced_string2);
        String replaced_string3=name.replace("u","neh"); // This replace char with string.
        System.out.println(replaced_string3);
        */

        /*
        //name.startsWith() -> This method gives output in boolean data type.
        // If string starts with given string it returns true and if it not started as given string then it returns false.
        System.out.println(name.startsWith("S"));
        //name.endsWith() -> This method gives output in boolean data type.
        // If string end with given string it returns true and if it not then it returns false.
        System.out.println(name.endsWith("o"));
         */

        /*
        //name.charAt(index) -> This method returns character in string at given index.
        char char_at_given_index=name.charAt(2);
        System.out.println(char_at_given_index);
        */

        /*
        //name.indexOf() -> This method returns index of given string.
        System.out.println(name.indexOf('y'));
        //If we give string as input then it simply returns the index
        System.out.println(name.indexOf("og"));
        */

        /*
        IndexOf Part II
        String new_name="Suyogyog";
        System.out.println(new_name.indexOf("uy",5));
        System.out.println(new_name.indexOf("0g41",5));
        //In above method if given string not match with required string then it returns -1.
        System.out.println(new_name.lastIndexOf("uy",4));
        */

        //String_name.equals() -> This method compares the string and return true of false.
        System.out.println(name.equals("Suyog"));
        System.out.println(name.equals("suyog"));//If there is any change in case of string then it makes new string.
        // although their spellings are same but strings are different.
        System.out.println(name.equalsIgnoreCase("suYog"));//This method removes problem in above method as stated above.




    }


}
