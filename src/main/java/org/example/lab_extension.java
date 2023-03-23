package org.example;
import java.util.Scanner;
public class lab_extension {
    public static void main(String[] args) {
//        ask the user what the weather is like and what the average temperature is
        System.out.println("What is the weather like?Is it sunny, raining, snowing or windy?" );
        System.out.println("What is the average temperature? ");
//        use scanner to allow user to input their answers: string for the weather and int for the temperature
        Scanner weather = new Scanner(System.in);
        String weatherOutside = weather.nextLine();
        Scanner temp = new Scanner(System.in);
        int tempOutside = temp.nextInt();

        if (weatherOutside.equals("sunny") && tempOutside > 15){
            System.out.println("Wear Sunglasses");
        } else if (weatherOutside.equals("raining") && tempOutside < 15){;
            System.out.println("Wear a raincoat");
        } else if (weatherOutside.equals("snowing") && tempOutside < 5){
            System.out.println("Wear a thick winter coat");
        } else {
            System.out.println("Wear a windbreaker");
        }
    }
}
