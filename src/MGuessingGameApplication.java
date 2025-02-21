import java.util.Scanner;

public class MGuessingGameApplication {
    static final int HIDDEN_NUMBER = (int) (Math.random() * 100);
    static final int MAX_ATTEMPT = 5;
    static final int MAX_RANGE = 100;
    static final int MIN_RANGE = 1;

    public static void main(String[] args) {
        System.out.println("please insert number between 1 to 100 :");
        Scanner scanner = new Scanner(System.in);
        int userAttempt = 0;
        int userNumber;
        while (userAttempt < MAX_ATTEMPT){
            if (!scanner.hasNextInt()){
                System.out.println("please insert valid number");
                scanner.next();
                continue;
            }
            userNumber = scanner.nextInt();
            if (userNumber < MIN_RANGE || userNumber > MAX_RANGE){
                System.out.println("please enter number between 1 to 100");
                continue;
            }

            if (userNumber == HIDDEN_NUMBER ){
                System.out.println("you won");
                break;
            }
            if (userNumber > HIDDEN_NUMBER){
                System.out.println("please pick lower number");
            }else {
                System.out.println("please pick higher number");
            }

            userAttempt++;
        }

        if (userAttempt == MAX_ATTEMPT){
            System.out.println("you loser the number was :" + HIDDEN_NUMBER);
        }

    }

}

