
//import java.util.ArrayList;
//import java.util.List;
public class Main {

    public static void main(String[] args) {

        Game game = new Game();
       // Player player = new PlayerComputer("Stefan");
        game.addPlayer(new PlayerComputer("Stefan"));
       // Player player2 = new PlayerComputer("Stefan");
        game.addPlayer(new PlayerComputer("Stefan"));
        game.play();
        
        /*
        List<String> list = new ArrayList();
        list.add("jeden");
        list.add("dwa");
        System.out.println(list);
        
        for(int i = 0; i < list.size(); i++){
             System.out.println(list.get(i));
        }
        
        for(String s : list){
            System.out.println(s);
        }
        Iterator<String> it = list.interator();
        while.(it.hasNest()){
        system.out.println(it.next());
        }
        .next();
        .hasNext();
        
        for(Iterator<String> it = list.interator() ; it.hasNext(); ){ //operator w pętli
        system.out.println(it.next());
        }
        
        
        
       

        try {
            player.setName("Stefan");
        } catch (IllegalArgumentException ex) {
            System.err.println("Nieprawidłowe imię: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.err.println("Błąd: " + ex.getMessage());
        }
         */

    }

}
//regex101
