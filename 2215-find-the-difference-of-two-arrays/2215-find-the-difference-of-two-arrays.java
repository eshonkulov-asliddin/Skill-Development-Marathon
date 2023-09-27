class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    
        
        Set<Integer> nums1Set = getSetOfValues(nums1);
        Set<Integer> nums2Set = getSetOfValues(nums2);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        ans.add(getDiff(nums1, nums2Set));
        ans.add(getDiff(nums2, nums1Set));
        
        return ans;
    }
    
    public List<Integer> getDiff(int[] nums, Set<Integer> set){
        
        List<Integer> diffList = new ArrayList<>();
        for (int num : nums){
            if (!set.contains(num)){
                diffList.add(num);
                set.add(num); //for duplicate cases
            }
        }
        
        return diffList;
    }
    
    public Set<Integer> getSetOfValues(int[] nums){
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        return set;
    }
}