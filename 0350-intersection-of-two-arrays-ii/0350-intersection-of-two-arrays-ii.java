class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> freq1 = getMap(nums1);
        Map<Integer, Integer> freq2 = getMap(nums2);
        
        List<Integer> list = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : freq1.entrySet()) {
            
            int key = entry.getKey(), value = entry.getValue();
            
            boolean keyValid = freq2.containsKey(key);
            boolean occurValid = false;
            
            if (keyValid){
                int occur = Math.min(freq2.get(key), value);
                for (int i = 0; i < occur; i++){
                    list.add(key);
                }
            }
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for (int num : list){
            ans[i++] = num;
        }
        
        return ans;
    }
    
    public Map<Integer, Integer> getMap(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return map;
    }
}