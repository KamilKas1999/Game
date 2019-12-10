
import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<Player, Integer> stats = new HashMap();

    void print() {
        //System.out.println(stats);

        //  for(Player player:stats.keySet()){
        //     System.out.println(player.getName()+": "+stats.get(player));
        // }
        stats.forEach((Player player, Integer score)
                -> System.out.println(player.getName() + ": " + score));
    }

    void andTheWinnerIs(Player player) {
        int score = stats.getOrDefault(player, 0) + 1;
        stats.put(player, score);
    }

    void clear() {
        stats.clear();
    }

}

//wyswietlanie statystyk print()
// winner(Player)
//clear()
