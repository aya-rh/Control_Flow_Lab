import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class WhatShouldIWear {
    public static void main(String[] args) {
        // Prompt user to input weather descriptors and average temperature
        // Collect user input
        // Example if weather is rainy and less than 12 degrees, output "Wear a raincoat."

        System.out.println("Welcome to my What Should I Wear app!");
        System.out.println("Tell me what the temperature is and what the weather is like today and I'll tell you what to wear?");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the temperature here:");
        String input = reader.nextLine();
        int temperature = parseInt(input);
        System.out.println("Enter the weather description here:");
        String weather = reader.nextLine();

        if (temperature >= -20 && temperature <= 0) {
            System.out.println("Why are you asking me, go grab your winter coat!");
        }
        else if (temperature >= 1 && temperature <= 10) {
            System.out.println("You might want to take a windbreaker with you!");
        }
        else if (temperature >= 11 && temperature <= 19) {
            System.out.println("The weather could be nicer, perfect sweater weather.");
        }
        else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Is it summer here or what, go change into your summer clothes.");
        }
        else if (temperature >= 31 && temperature <= 50) {
            System.out.println("Forget clothes, go grab an ice cream!");
        }
        else {
            System.out.println("Are you even living on earth?");
        }



        if (weather.equals("chilly") && temperature >= -20 && temperature <= 5) {
            System.out.println("Can you still feel your toes?");
        }

        else if (weather.equals("windy") && temperature >= 6 && temperature <= 18) {
            System.out.println("It must be so cold!");
        }

        else if (weather.equals("sunny") && temperature >= 19 && temperature <= 50) {
            System.out.println("Are you not melting right now?");
        }
    }
}
