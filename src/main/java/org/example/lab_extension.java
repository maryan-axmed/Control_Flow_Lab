package org.example;
import java.util.Scanner;
public class lab_extension {
    public static void main(String[] args) {
//        ask the user what the weather is like
        System.out.println("What is the weather like?Is it sunny, raining, snowing or windy?" );
//        use scanner to allow user to input their answer
        Scanner weather = new Scanner(System.in);
        String weatherOutside = weather.nextLine();
        if (weatherOutside.equals("sunny")){
            System.out.println("Wear Sunglasses");
        } else if (weatherOutside.equals("raining")){;
            System.out.println("Wear a raincoat");
        } else if (weatherOutside.equals("snowing")){
            System.out.println("Wear a thick winter coat");
        } else {
            System.out.println("Wear a windbreaker");
        }
    }
}
