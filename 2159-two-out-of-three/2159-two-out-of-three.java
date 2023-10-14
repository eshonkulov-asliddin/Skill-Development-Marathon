class Solution {

    private Map<Integer, Integer> numOccurrence = new HashMap<>(); 

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        // fill map with val and occurrence
        fillMap(convertArrToSet(nums1));
        fillMap(convertArrToSet(nums2));
        fillMap(convertArrToSet(nums3));

        List<Integer> result = new ArrayList<>();

        // collect two or more occured nums
        for (Map.Entry<Integer, Integer> entry : numOccurrence.entrySet()){

            if (entry.getValue() >= 2){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public Set<Integer> convertArrToSet(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        return set;
    }

    public void fillMap(Set<Integer> nums){
        
        for (int num : nums){
            numOccurrence.put(num, numOccurrence.getOrDefault(num, 0) + 1);
        }

    }
}

/**
    Time Complexity: O(n+m+l)
    Space Complexity: O(n+m+l)
 */