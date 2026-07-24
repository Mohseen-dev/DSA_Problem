class Solution {
    public static void reverse(int start, int last, int[] nums) {
        int i = start;
        int j = last;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length > 1 && k < nums.length) {
            reverse(0, nums.length - k - 1, nums);

            reverse(nums.length - k, nums.length - 1, nums);

            reverse(0, nums.length - 1, nums);

        }

    }
}