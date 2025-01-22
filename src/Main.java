import java.util.Scanner;


public class Main {
    public static final int  hiddenNumber = (int) (Math.random()*100);
    public static int gameTries = 5;
    static int userNumber;
    public static final  int rangeMax = 100;
    public static final  int rangeMin = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (gameTries > 0){
            System.out.println("Pick a number between 1 and 100");

            if(scanner.hasNextInt()){
                userNumber = scanner.nextInt();
                if(userNumber < rangeMin || userNumber > rangeMax) {
                    System.out.println("Your guess is not between 1 and 100, please try again.");
                    continue;
                }

                if (userNumber < hiddenNumber){
                    System.out.println("Please pick a higher number");
                }else if(userNumber > hiddenNumber){
                    System.out.println("Please pick a lower number");
                }else {
                    System.out.println("you win");
                    break;
                }

                gameTries--;
            }else {
                System.out.println("please enter the valid integer :) ");
                scanner.next();
            }


        }

        if(gameTries == 0 ) System.out.println("you lose \n The number was : "  + hiddenNumber);
    }
}
 