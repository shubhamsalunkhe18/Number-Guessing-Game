import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != number) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High! Try again.");
            } 
            else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } 
            else {
                System.out.println("🎉 Congratulations! You guessed the correct number.");
                System.out.println("Total Attempts: " + attempts);
            }
        }

        sc.close();
    }
}