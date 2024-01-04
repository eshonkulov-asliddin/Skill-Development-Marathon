class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
                
        
        int[] res = new int[k];
        
        for (int i = 0; i < k; i++) {
            res[i] = getKeyOfMaxValue(freq);
        }
        
        return res;
        
    }
    
    private int getKeyOfMaxValue(Map<Integer, Integer> map) {
        int maxValue = 0;
        int maxKey = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        map.put(maxKey, 0);
        return maxKey;
    }
}