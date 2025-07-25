class NonZero{
    public static void main(String args[]){
        int[] arr={1,3,0,14,0,8,0};
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}