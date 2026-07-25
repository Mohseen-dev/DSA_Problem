class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        // Approach 1 : - 

        // int n = arr.length;
        // int tempOnes = 0;
        // int finalOnes = 0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==1){
        //         tempOnes++;
        //         if(tempOnes>finalOnes) finalOnes = tempOnes;

        //     }else{
        //         tempOnes = 0;
        //     }
        // }
        // return finalOnes;

        // Approach 2 :- 

        int l = 0;
        int u = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                u++;
            } else {
                int t = u - l;
                if (max < t)
                    max = t;
                u = i;
                l = i;
            }
        }
        System.out.println(max);
        System.out.println("u : " + u);
        System.out.println("l : " + l);
        System.out.println(u - l);
        if (max < u - l)
            max = u - l;
        return max;
    }
}