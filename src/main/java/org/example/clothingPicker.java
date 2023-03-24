package org.example;

import java.util.Scanner;

public class clothingPicker {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please describe the weather (e.g. sunny, raining, snow) ");
        String weather = reader.nextLine();

        System.out.println("Please enter the temperature: ");
        int temp = reader.nextInt();
//the .toLowerCase method will force the users input text to be lower case
        if (weather.toLowerCase().equals("sunny") && temp > 8){
            System.out.println("Wear short sleeves and sunglasses");
        }
        if (weather.toLowerCase().equals("sunny") && temp <8 ) {
            System.out.println("Sunglasses and a thin coat");
        }
//        need to make loads of if statement if the logic is not dependent on the previous statement
//        this is a bouncer pattern-there are seperate checks essentially
    }
}
