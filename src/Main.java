import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            GameFrame gameFrame = new GameFrame();
            System.out.println("Pick a number between 1 and 100 :");
            gameFrame.Game(scanner.nextInt());
        }
}
