
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Player player = new Player();
        Random dice = new Random();
        int diveThrow, playerGuess;
        boolean win = false;

        player.setName(null);
        do {

            diveThrow = dice.nextInt(6) + 1;

            playerGuess = player.guess();

            System.out.println("Wylosowana liczba: " + diveThrow + " Liczba gracza " + player.getName() + ": " + playerGuess);

            if (diveThrow == playerGuess) {
                win = true;
                System.out.println("Zgadłeś!");
            } else {

                System.out.println("Nie zgadłeś!");
            }

        } while (win == false);

    }

}
