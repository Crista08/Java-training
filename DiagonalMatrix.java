class DiagonalMatrix{
    public static void main(String args[]){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int rowslen=arr.length;
        int colmlen=arr[0].length;
        int noOfElements=rowslen*colmlen;
        int[] result=new int[noOfElements];
        int i=0;
        int row=0;
        int colm=0;
        boolean isUp=true;
        while(i<noOfElements){
            result[i++]=arr[row][colm];
            if(isUp){
            if(colm==colmlen-1){
                row++;
                isUp=false;
            }
            else if(row==0){
                colm++;
                isUp=false;
            }
            else{
                row--;
                colm++;
            }
        }
        else{
            if(row==rowslen-1){
                colm++;
                isUp=true;

            }
            else if(colm==0){
                row++;
                isUp=true;
            }else{
                row++;
                colm--;
            }
        }
    }
        for(int num:result){
            System.out.println(num+" ");
        }
        }
    }