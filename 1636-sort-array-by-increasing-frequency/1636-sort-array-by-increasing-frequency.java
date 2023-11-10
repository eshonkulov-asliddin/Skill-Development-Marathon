class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer, Integer> freq = getFreq(nums);
        
        int n = freq.size();
        
        Set<Integer> seen = new HashSet<>();
        
        int[] res = new int[nums.length];
        int pointer = 0;
        for (int i = 0; i < n; i++){
            // get key with lower freq
            int key = getLowerFreqKey(freq, seen);
            int range = freq.get(key);
            
            seen.add(key);
            
            for (int j = 0; j < range; j++){
                res[pointer++] = key;
            }
            
        }
        
        return res;
        
        
    }
    
    public int getLowerFreqKey(Map<Integer, Integer> freq, Set<Integer> seen){
        int key = 0, value = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int curKey = entry.getKey(), curVal = entry.getValue();
            
            if ((curVal < value && !seen.contains(curKey)) || 
                (curVal == value && curKey > key && !seen.contains(curKey))){
                key = curKey;
                value = curVal;
            }
        }
        
        return key;
        
        
    }
    
    public Map<Integer, Integer> getFreq(int[] nums){
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return freq;
    }
}

/*
    
    Time Complexity: n2
    Space Complexity: O(n+m)
*/