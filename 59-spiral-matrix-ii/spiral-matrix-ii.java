class Solution {
    public int[][] generateMatrix(int n) {
        int totalElement = n*n,num=1;
        // declaration of empty matrix
        int[][] res = new int[n][n];
        int minRow=0,maxRow=n-1;
        int minCol=0,maxCol=n-1;
        while(num<=totalElement && minCol<=maxCol && minRow<=maxCol){
            // right
            for(int j=minCol;j<=maxCol;j++){
                res[minRow][j]=num;
                num++;
            }
            minRow++;

            // down
            for(int i=minRow;i<=maxRow && num<=totalElement;i++){
                res[i][maxCol]=num;
                num++;
            }
            maxCol--;

            // left
            for(int j=maxCol;j>=minCol && num<=totalElement;j--){
                res[maxRow][j]=num;
                num++;
            }
            maxRow--;

            // up
            for(int i=maxRow;i>=minRow && num<=totalElement;i--){
                res[i][minCol] = num;
                num++; 
            }
            minCol++;
        }
        return res;

    }
}