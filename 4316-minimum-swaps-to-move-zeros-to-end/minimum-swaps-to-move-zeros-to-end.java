class Solution {
    public int minimumSwaps(int[] nums) {
        int minSwap = 0;
        int j = nums.length - 1;
        int i=0;
        while (i<j) {
            if (nums[i] == 0 && nums[j] != 0) {
                // swaping occur
                IO.println("i" + i);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                minSwap++;
                i++;
                j--;

            } else if (nums[i] != 0 && nums[j] == 0) {
                i++;
                j--;

            } else if (nums[i] == 0 && nums[j] == 0) {
                j--;
            } else if (nums[i] != 0 && nums[j] != 0) {
                i++;
                // j--;
            }
        
        }
        return minSwap;

    }
}
