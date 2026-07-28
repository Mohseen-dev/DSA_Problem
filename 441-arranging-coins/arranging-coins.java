class Solution {
    public int arrangeCoins(int n) {
        long low=1,high=n,mark=n;
        while(low<=high){
            // mid
            long mid = low + (high-low)/2;
            long sumOfMidSeries = (mid * (mid+1))/2;
            if(sumOfMidSeries<=n){
                mark = mid;
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return (int)mark;
    }
}