package com.company;
import java.util.Scanner;
class Pirates{
int id;
String name;
int bounty;
void print_Posters(){
    System.out.println("Pirate Id is "+id);
    System.out.println("Pirate name is "+name);
    System.out.println("Bounty of pirate is "+bounty);

}
int increase_bounty(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount by which we want to increase the bounty of given person ");
    int increment= sc.nextInt();
    bounty=bounty+increment;
    return bounty;
}


}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("Custom class working strats!");
        Pirates sonu=new Pirates();
        sonu.id=1;
        sonu.name="Sonu";
        sonu.bounty=50000;
        sonu.print_Posters();

        Pirates luffy=new Pirates();
        luffy.id=2;
        luffy.name="Monkey D. Luffy";
        luffy.bounty=50500;
        luffy.print_Posters();
        luffy.increase_bounty();
        System.out.println("New bounty of luffy will be "+luffy.bounty);



    }
}
