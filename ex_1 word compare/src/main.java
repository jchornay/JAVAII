/*
 * CMSY 167-N090 Spring 2023
 * Exercise: Word Compare
 * Copyright 2023 Howard Community College
 * @author Jonathan Chornay
 * @v1.0
 *
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //creates new scanner object for user input
        Scanner input = new Scanner(System.in);

        //sentinel value
        boolean loop = true;

        //loops until sentinel is false
        while(loop){

            System.out.print("Please enter a word: ");

            //saves user input as string s1 and trims whitespace
            String s1 = input.nextLine();
            s1 = s1.trim();

            System.out.print("Please enter another word: ");

            //saves user input as string s2 and trims whitespace
            String s2 = input.nextLine();
            s2 = s2.trim();

            int compare = s1.compareToIgnoreCase(s2);

            //returns true if the value of s1 is less than the value of s2, i.e. earlier in the alphabet
            if (compare<0){

                System.out.printf("%n%s comes before %s%n", s1, s2);

            }

            //returns true if s1 and s2 have the same value
            if (compare==0){

                System.out.printf("%n%s and %s are the same%n", s1, s2);

            }

            //returns true if the value of s1 is greater than the value of s2, i.e. later in the alphabet
            if (compare>0){

                System.out.printf("%n%s comes before %s%n", s2, s1);

            }

            System.out.print("Would you like to compare more words? (Yes/No): ");

            String quit = input.nextLine();

            System.out.println();

            quit = quit.trim();

            if(quit.equalsIgnoreCase("no")){

                loop = false;

            }

        } //end while loop

        System.out.printf("Goodbye.");

    }
}