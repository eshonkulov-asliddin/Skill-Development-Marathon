class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> loserCountMap = new HashMap<>();
        Set<Integer> allPlayers = new TreeSet<>();

        for (int[] match : matches){
            int winner = match[0];
            int loser = match[1];
            allPlayers.add(winner);
            allPlayers.add(loser);
            loserCountMap.put(loser, loserCountMap.getOrDefault(loser, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
       
        List<Integer> winnersWithoutLose = new ArrayList<>();
        List<Integer> winnersWithOneLose = new ArrayList<>();
        for (int winner : allPlayers) {
            // player without lose
            if (!loserCountMap.containsKey(winner)){
                winnersWithoutLose.add(winner);
            }else{
                // player with one loose
                if (loserCountMap.get(winner) == 1){
                    winnersWithOneLose.add(winner);
                }
            }
        }

        result.add(winnersWithoutLose);
        result.add(winnersWithOneLose);

        return result;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
 */