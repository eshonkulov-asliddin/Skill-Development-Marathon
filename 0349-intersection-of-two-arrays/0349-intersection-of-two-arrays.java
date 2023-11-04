class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0, p2 = 0;

        Set<Integer> intersections = new HashSet<>();

        while (p1 < nums1.length && p2 < nums2.length) {

            if (nums1[p1] == nums2[p2]) {
                intersections.add(nums1[p1]);
                p1++;
                p2++;
            }else if (nums1[p1] > nums2[p2]) {
                p2++;
            }else{
                p1++;
            }
        }

        int[] res = new int[intersections.size()];

        int i = 0;
        for (int intersection : intersections) {
            res[i++] = intersection;
        }

        return res;
        
    }
}

/**

    nums1 = [4,5,9], nums2 = [4, 4, 8, 9, 9]
    

    

 */