import java.util.Scanner;

public class GameFrame {

    public final int  hiddenNumber = (int) (Math.random()*100);
    public int GameTries = 5;
    int userNumber;
    public final  int RangeMax = 100;
    public final  int RangeMin = 0;
    Scanner scanner = new Scanner(System.in);

    public void Game(int userNumber) {
        Game(userNumber , GameTries);
    }


    public void Game(int userNumber , int GameTries){
        if(GameTries == 1){
            System.out.println("The number to guess was: " + hiddenNumber);
            System.out.println("you lose!");
        }else {
            if(userNumber > RangeMax || userNumber <= RangeMin){
                System.out.println("Your guess is not between 1 and 100, please try again");
                Game(scanner.nextInt(), GameTries);
            }else {
                if (userNumber > hiddenNumber){
                    System.out.println("Please pick a lower number");
                    Game(scanner.nextInt(), --GameTries);
                }else if(userNumber < hiddenNumber){
                    System.out.println("Please pick a higher number");
                    Game(scanner.nextInt(),--GameTries);
                }else {
                    System.out.println("you won!");
                }

            }
        }
    }
}
