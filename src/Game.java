
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Player player;
        Random dice = new Random();
        int diveThrow, playerGuess;

        player = new PlayerComputer();
        
        try{
        player.setName("HJhj");
        }catch(IllegalArgumentException ex){
            System.err.println("Nieprawidłowe imię: " + ex.getMessage());
        }catch(NullPointerException ex){
            System.err.println("Błąd: " + ex.getMessage());
        }
        
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
//regex101