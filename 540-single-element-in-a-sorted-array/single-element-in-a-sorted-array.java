class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        // corner case 
        if(n==1 || arr[0]!=arr[1]){
            return arr[0];
        }
        else if(arr[n-2]!=arr[n-1]){
            return arr[n-1];
        }else{
            // Binary Seaching technique
        int low=0,high=n-1;
        while(low<=high){
            // find mid
            int mid = low+(high-low)/2;

            // check found condition
            if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid-1]==arr[mid] || arr[mid]==arr[mid+1]){
                // find occuence
                int firstOccurence = mid;
                int secondOccurence=mid;
                if(arr[mid-1]==arr[mid]){
                    firstOccurence = mid-1;
                }else{
                    secondOccurence = mid+1;
                }
                if((firstOccurence-low)%2==0){
                    low=secondOccurence+1;
                }else{
                    high=firstOccurence-1;
                }
            }

        }

        }


        
        return -1;
    }
}