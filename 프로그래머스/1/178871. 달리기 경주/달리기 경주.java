import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        String p ="";
        int idx = 0;
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            idx = playerMap.get(calling);

            p = players[idx - 1];
            players[idx - 1] = calling;
            players[idx] = p;   
            
            playerMap.put(calling, idx - 1);
            playerMap.put(p, idx);
        }

        return players;
    }
}
