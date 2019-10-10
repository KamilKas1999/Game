package game;

import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Random dive = new Random();
        int diveThrow, player;
        boolean win = false;

        do {

            diveThrow = dive.nextInt(6) + 1;
            player = dive.nextInt(6) + 1;
            System.out.println("Wylosowana liczba: " + diveThrow + " Liczba gracza: " + player);

            if (diveThrow == player) {
                win = true;
                System.out.println("Zgadłeś!");
            } 
            else {

                System.out.println("Nie zgadłeś!");
            }

        } while (win == false);

    }

}
