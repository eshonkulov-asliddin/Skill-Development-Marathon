class Solution {
    public int[] numberOfPairs(int[] nums) {
        int length = nums.length;

        // base case
        if (length == 1){
            return new int[]{0, 1};
        }

        int countPairs = 0;
        int remainedNum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){

            int val = entry.getKey();
            int occur = entry.getValue();

            if (occur % 2 == 0){
                countPairs += (int) occur / 2;
            }else{
                countPairs += (int) occur / 2;
                remainedNum++;
            }
        }

        return new int[]{countPairs, remainedNum};
        
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
 */