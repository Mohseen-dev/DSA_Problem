class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        // corner case-1
        if(arr[0]>=x){
            for(int i=0;i<k;i++){
                res.add(arr[i]);
            }
            return res;
        }
        // corner case-2
        if(arr[n-1]<=x && arr[n-2]!=arr[n-1]){
            for(int i=n-1;i>=k;i--){
                res.add(arr[i]);

            }
            Collections.sort(res);
            return res;
        }
        // find lower bound using Bineary Search (T.C = O(logn))
        int low=0,high=n-1,lower=n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=x){
                lower = mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }

        // set two pointer
        int p=lower-1,q=lower;
        while(k>0 && p>=0 && q<n){
            if(Math.abs(arr[p]-x)<Math.abs(arr[q]-x)){
                res.add(arr[p]);
                p--;
                k--;
            }
            else if(Math.abs(arr[p]-x)==Math.abs(arr[q]-x)){
                if(arr[p]<arr[q]){
                    res.add(arr[p]);
                    p--;
                    k--;

                }else{
                    res.add(arr[q]);
                    q++;
                    k--;
                }
            }
            else{
                res.add(arr[q]);
                q++;
                k--;

            }
        }
        // remaining element of p
        while(k>0 && p>=0){
            res.add(arr[p]);
            p--;
            k--;
        }
        
        while (k>0 && q<n) {
            res.add(arr[q]);
            q++;
            k--;
        }
        Collections.sort(res);
        return res;

        
    }
}