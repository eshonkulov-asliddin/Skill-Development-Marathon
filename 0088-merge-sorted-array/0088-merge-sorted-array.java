class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) return;

        int[] res = new int[m+n];

        int i = 0, l = 0, r = 0;
        while (l < m && r < n){
            if (nums1[l] > nums2[r]){
                res[i] = nums2[r++];
            }else{
                res[i] = nums1[l++];
            }
            i++;
        }

        while (l < m){
            res[i++] = nums1[l++];
        }

        while (r < n){
            res[i++] = nums2[r++];
        }

        for (int j = 0; j < res.length; j++){
            nums1[j] = res[j];
        }

    }
}