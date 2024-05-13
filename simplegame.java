import java.util.Random;
import java.util.Scanner;

public class NinetiesGuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxAttempts = 5;
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the 90s Guess the Number Game!");
        System.out.println("I've selected a number between 1 and 100. Can you guess it?");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
            guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
            
            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
