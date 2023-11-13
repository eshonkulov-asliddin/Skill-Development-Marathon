import java.util.*;

class Solution {
    public int edgeScore(int[] edges) {
        Map<Integer, List<Integer>> map = getDirectedMap(edges);
        return getMaxEdgeScore(map);
    }

    public int getMaxEdgeScore(Map<Integer, List<Integer>> map) {
        int maxNode = Integer.MIN_VALUE;
        long maxEdge = 0;

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int node = entry.getKey();
            long sumEdge = entry.getValue().stream().mapToLong(Long::valueOf).sum();

            if (sumEdge > maxEdge || (sumEdge == maxEdge && node < maxNode)) {
                maxNode = node;
                maxEdge = sumEdge;
            }
        }

        return maxNode;
    }

    public Map<Integer, List<Integer>> getDirectedMap(int[] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        int n = edges.length;
        for (int i = 0; i < n; i++) {
            int curVal = edges[i];

            if (curVal != i) {
                map.computeIfAbsent(curVal, k -> new ArrayList<>()).add(i);
            }
        }

        return map;
    }
}
