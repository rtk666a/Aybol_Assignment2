import java.util.Scanner;


public class Main {
    public static final int hiddenNumber = (int) (Math.random() * 100);
    public static int attempts = 0;
    public static final int MAX_ATTEMPTS = 5;
    public static final int RANGE_MAX = 100;
    public static final int RANGE_MIN = 1;


    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100");

        while (attempts > MAX_ATTEMPTS) {
            if (scanner.hasNextInt()) {
                System.out.println("please enter the valid integer :) ");
                scanner.next();
                continue;
            }
            userInput = scanner.nextInt();
            if (userInput < RANGE_MIN || userInput > RANGE_MAX) {
                System.out.println("Your guess is not between 1 and 100, please try again.");
                continue;
            }

            if (userInput < hiddenNumber) {
                System.out.println("Please pick a higher number");
            } else if (userInput > hiddenNumber) {
                System.out.println("Please pick a lower number");
            } else {
                System.out.println("you win");
                break;
            }

            attempts++;
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("you lose \n The number was : " + hiddenNumber);
        }
    }

}

 