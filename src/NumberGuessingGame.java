import java.util.Scanner;
    public class NumberGuessingGame {
        public static void main(String[] args) {
            // Prompt user to input their secret number guess
            // Collect user input
            // If number is 4, print "Well Done! You guessed it."
            // Give user "Close!" prompts
            // Otherwise, print "Nope!"

            System.out.println("Welcome to the number guessing game!");
            System.out.println("The secret number will be a number between 1 and 5, take your guess below");
            System.out.println("What is the secret number?");

            Scanner reader = new Scanner(System.in);
            String secretNumber = reader.nextLine();

            // could have done
            // int secretNumber = reader.nextInt();
            // if (secretNumber > 4) {
            // system.out.println ("")
            // }
            // would be useful for larger number ranges


            if (secretNumber.equals("4")) {
                System.out.println("Well Done!.");
            }
            else if (secretNumber.equals("1")) {
                System.out.println("Too Low!");

            }
            else if (secretNumber.equals("2")) {
                System.out.println("Too Low!");

            }
            else if (secretNumber.equals("3")) {
                System.out.println("Too Low!");

            }
            else if (secretNumber.equals("5")) {
                System.out.println("Too High!");
            }
            else {
                System.out.println("Nope!");
            }

            String result = secretNumber.equals("4") ? "You guessed it." : "Try again.";
            System.out.println(result);

        }
    }

