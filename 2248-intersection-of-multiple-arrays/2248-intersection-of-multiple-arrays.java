class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        int ROWS = nums.length, COLS = 0;
        Set<Integer> seen = getFirstSet(nums);
        
        
        for (int r = 1; r < ROWS; r++){
             COLS = nums[r].length;
            Set<Integer> curSeen = new TreeSet<>();
            for (int c = 0; c < COLS; c++){
                int curValue = nums[r][c];
                
                if (seen.contains(curValue)){
                    curSeen.add(curValue);
                }
            }
            
            seen = curSeen;
        }
        
        return seen.stream().collect(Collectors.toList());
    }
    
    public Set<Integer> getFirstSet(int[][] nums){
        // we need only first arr nums
        int ROWS = 1, COLS = 0;
        
        Set<Integer> set = new TreeSet<>();
        
        for (int r = 0; r < ROWS; r++){
            COLS = nums[r].length;
            for (int c = 0; c < COLS; c++){
                set.add(nums[r][c]);
            }
        }
        
        return set;
    }
}

/*
    Time Complexity: O(n*m)
    Space Complexity: O(n*m)
*/