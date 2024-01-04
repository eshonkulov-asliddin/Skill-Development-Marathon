class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
                
        
        Map<Integer, List<Integer>> valuesFreq = new HashMap<>();
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int occurrence = entry.getValue();
            int key = entry.getKey();
            
            List<Integer> list = valuesFreq.getOrDefault(occurrence, new ArrayList<>());
            list.add(key);
            valuesFreq.put(occurrence, list); 
            
        }
        
        int[] res = new int[k];
        int count = 0;
        
        for (int i = nums.length; i >= 0; i--) {
            List<Integer> mostFreqKeys = valuesFreq.get(i);
            
            if (mostFreqKeys == null){
                continue;
            }
            
            for (int j = 0; j < mostFreqKeys.size(); j++) {
                if (count == k) {
                    break;
                }
                res[count++] = mostFreqKeys.get(j);
            }
            
            if (count == k) {
                break;
            }
        }
        
        return res;
    }
    
}