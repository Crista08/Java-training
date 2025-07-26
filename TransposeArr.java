class TransposeArr{
    public static void main(String args[]){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        };
        int m=arr.length;
        int n=arr[0].length;
        int[][] transposeArr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transposeArr[i][j]=arr[j][i];
            }
        }
        for(int[] row:transposeArr){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}