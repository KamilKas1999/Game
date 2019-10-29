
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Player player;

        player = new PlayerComputer();

        Random dice = new Random();
        int diveThrow, playerGuess;

        player.setName("Kamil");

        do {

            diveThrow = dice.nextInt(6) + 1;

            playerGuess = player.guess();

            System.out.println("Wylosowana liczba: " + diveThrow + " Liczba gracza " + player.getName() + ": " + playerGuess);

            if (diveThrow != playerGuess) {
                System.out.println("Nie zgadłeś!");
            }

        } while (diveThrow != playerGuess);

        System.out.println("Zgadłeś!");
    }

}
