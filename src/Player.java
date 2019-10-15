
import java.util.Random;

public class Player {

    private Random dice = new Random();

    private String name;

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.err.println("Nie podano imienia");
        }
    }

    public String getName() {
        return name;
    }

    public int guess() {

        return dice.nextInt(6) + 1;

    }

}
