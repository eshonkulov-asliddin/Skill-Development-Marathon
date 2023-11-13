class Solution {
    public int edgeScore(int[] edges) {
        
        Map<Integer, List<Integer>> map = getDirectedMap(edges);
        
        return getMaxEdgeScore(map);
        
    }
    
    public int getMaxEdgeScore(Map<Integer, List<Integer>> map){
        int maxNode = Integer.MIN_VALUE;
        long maxEdge = 0;
        
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            int node = entry.getKey();
            List<Integer> edges = entry.getValue();
            
            long sumEdge = edges.stream().mapToLong(edge -> edge).sum();
            
            if ((sumEdge > maxEdge) || 
                (sumEdge == maxEdge && node < maxNode)){
                maxNode = node;
                maxEdge = sumEdge;
            }
        }
        
        return maxNode;
    }
    
    public Map<Integer, List<Integer>> getDirectedMap(int[] edges){
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            int curVal = edges[i];

            if (curVal != i) {
                List<Integer> list = map.getOrDefault(curVal, new ArrayList());
                list.add(i);

                map.put(curVal, list);
            }
        }

        return map;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/