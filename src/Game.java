
import java.util.Random;

public class Game {

    private Random dice = new Random();
    private Player player;

    public void addPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        int diveThrow, playerGuess;
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
