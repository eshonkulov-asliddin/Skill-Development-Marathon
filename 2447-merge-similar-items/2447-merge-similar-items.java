class Solution {
    
    private Map<Integer, Integer> map = new TreeMap<>();

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {


        fillMap(items1);
        fillMap(items2);

        List<List<Integer>> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            result.add(List.of(entry.getKey(), entry.getValue()));
        }
        
        return result;
    }

    public void fillMap(int[][] items){
        for (int[] item : items){
            this.map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
    }
}

/**
    Time Complexity: O(n log n)
    Space Complexity: O(n)
 */