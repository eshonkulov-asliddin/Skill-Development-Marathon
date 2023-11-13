class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer, String> map = getMap(names, heights);
        
        Arrays.sort(heights);
        
        int i = 0, n = heights.length - 1;
        while (n >= 0){
            String name = map.get(heights[n--]);
            names[i++] = name;
        }
        
        return names;
    }
    
    public Map<Integer, String> getMap(String[] names, int[] heights){
        Map<Integer, String> map = new HashMap<>();
        
        int n = names.length;
        
        for (int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }
        
        return map;
    }
}

/*
    Time Complexity: O(n log n)
    Space Complexity: O(n)
*/