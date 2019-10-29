
import java.util.Scanner;

public abstract class Player {

    Scanner scanner = new Scanner(System.in);

    private String name;

    public Player(String name) {
        setName(name);
    }

    public Player() {
        this.name = "Anonim";
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) { // !imie.isEmpty() nie działa na null, name.lenght() != 0, name.equals(""), "".name.equals(name), name != "" czasami nie działa
            this.name = name;
        } else {
            System.err.println("Nie podano imienia");
        }
    }

    public String getName() {
        return name;
    }
    
    public abstract int guess();

}
