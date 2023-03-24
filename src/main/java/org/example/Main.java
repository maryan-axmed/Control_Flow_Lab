package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        ask user to guess a number
        System.out.println("Guess the secret number: ");
//        use scanner to allow user to pass a integer
        Scanner userNumber = new Scanner(System.in);
        int secretNumber = userNumber.nextInt();
//        make if statements so that the program will return statements to the user
//        to see if there guess was close to the secret number
//        need to make if/else statements for if the number is too high, too low or if
//        the user got the correct number
//        I will set the secret number to be 38.
        if(secretNumber > 38) {
            System.out.println("Your guess is too high! Try again.");
        } else if (secretNumber < 38) {
            System.out.println("Your guess is too low! Try again.");
        } else {
            System.out.println("Well done! You have guessed the statement correctly!");
        }
    }
}