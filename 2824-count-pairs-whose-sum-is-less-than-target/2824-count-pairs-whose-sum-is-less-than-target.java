class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        
        Collections.sort(nums);
        
        int l = 0;
        int r = nums.size() - 1;
        
        int count = 0;
        while (l < r){
            if (nums.get(l) + nums.get(r) < target){
                count += r - l;
                l++;
            }else{
                r--;
            }
        }
        
        return count;
        
        
//         int length = nums.size();
//         int count = 0;
//         for (int i = 0; i < length; i++){
//             for (int j = i+1; j < length; j++){
//                 if ( (i >= 0 && i < j) &&
//                      (nums.get(i) + nums.get(j) < target) ){
                    
//                     count++;
//                 }
//             }    
//         }
        
//         return count;
    }
}