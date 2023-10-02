class Solution {
    
    private int sum = 0;
    
    public int sumOfUnique(int[] nums) {
        
        Map<Integer, Integer> numCount = new HashMap<>();
        
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        
        
        
        numCount.forEach( (key, value) -> {
            if (value == 1){
                sum += key;
            }
        });
        
        return sum;   
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/