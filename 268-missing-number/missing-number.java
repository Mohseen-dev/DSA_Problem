class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int actSum = ((nums.length)*(nums.length+1))/2;
        for(int i : nums){
            sum +=i;
        }
        return actSum-sum;
    }
}