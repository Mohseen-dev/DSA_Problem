class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int swap = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                // swaping
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
                swap++;

                }
            }
            if(swap==0){
                break;
            }
        }
        
    }
}