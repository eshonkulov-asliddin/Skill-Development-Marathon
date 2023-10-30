class Solution {
    public boolean isMonotonic(int[] nums) {
        return isIncreasing(nums) || isDecreasing(nums);
    }

    public boolean isIncreasing(int[] nums) {
        int l = 0, r = 1;

        while (r < nums.length) {

            if (nums[l] > nums[r]) {
                return false;
            }

            l++;
            r++;
        }

        return true;
    }

    public boolean isDecreasing(int[] nums) {
        int l = 0, r = 1;

        while (r < nums.length) {

            if (nums[l] < nums[r]) {
                return false;
            }

            l++;
            r++;
        }

        return true;
    }
}