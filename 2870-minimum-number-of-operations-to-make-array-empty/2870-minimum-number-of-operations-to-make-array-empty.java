class Solution {
    public int minOperations(int[] nums) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int operations = 0;
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int occurrence = entry.getValue();
            int key = entry.getKey();
            
            
            System.out.println(operations);
            
            while (occurrence >= 2) {
                
                if (occurrence % 3 == 0) {
                    operations += 1;
                    occurrence -= 3;
                }else {
                    operations += 1;
                    occurrence -= 2;   
                }

            }
            
            if (occurrence > 0) {
                return -1;
            }
        }
        
        return operations;
        
    }
}