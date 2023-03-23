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
//        need to make if/else statments for if the number is too high, too low or if
//        the user got the correct number
        if(secretNumber > 38) {
            System.out.println("your guess is too high");
        } else if (secretNumber < 38) {
            System.out.println("your guess is too low");
        } else {
            System.out.println("Well done! You have guessed the statement correctly!");
        }
    }
}