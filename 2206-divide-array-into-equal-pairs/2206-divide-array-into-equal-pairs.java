class Solution {
    public boolean divideArray(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return freq.values().stream().allMatch(value -> value % 2 == 0);
    }
}

/*
    T: O(n)
    S: O(n)
*/