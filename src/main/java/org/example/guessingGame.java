package org.example;

import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
//        need a secret number
//        user will need to guess it so I will need to take an input
//        message needed for the user if the guess is too high/low or correct
//        set the secret number to 9
        int secretNumber = 9;
//        ask user for their guess
        System.out.println("Guess what many favourite number is: ");
//        take the input
        Scanner sc = new Scanner(System.in);
        String guess = sc.nextLine();
        System.out.println("Your guess was: " + guess);
//        if the guess is equal to the string value of guess (which was initially an integer)
        if (guess.equals(String.valueOf(secretNumber))) {
            System.out.println("Nice! That was my fav number");
//            what about if the user got the answer wrong?
//            need to make guess an integer as you cannot compare string with integer
        } else if (secretNumber < Integer.valueOf(guess)) {
            System.out.println("Your guess is too high. Guess again!");
        } else {
            System.out.println("You guess is too low. Guess again!");
        }

    }
}
