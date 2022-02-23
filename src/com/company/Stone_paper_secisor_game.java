package com.company;
import java.util.Random;
import java.util.Scanner;
public class Stone_paper_secisor_game {
    public static void main(String[] args) {
            Random rand = new Random();
            int upperbound = 2;
            int int_random = rand.nextInt(upperbound);
            System.out.println("******* This is a STONE,PAPER AND SICCORE game ********");
            System.out.println("You have to select one of following :-");
            System.out.println("0 for Stone \n 1 for paper \n 2 for siccoser");
            Scanner sc = new Scanner(System.in);
            byte user_choice = sc.nextByte();
            System.out.println("Computer choice is " + int_random);
            System.out.println("Your Choice is " + user_choice);

            if (int_random == user_choice) {
                System.out.println("It's a draw match!");
            } else if ((int_random == 0 && user_choice == 2) || (int_random == 1 && user_choice == 0) || (int_random == 2 && user_choice == 1)) {
                System.out.println("You lose to computer");
            } else if ((int_random == 0 && user_choice == 1) || (int_random == 1 && user_choice == 2) || (int_random == 2 && user_choice == 0)) {
                System.out.println("User win this game");
            }

    }
}
