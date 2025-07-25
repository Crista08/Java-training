class RunningSum{
    public static void main(String args[]){
        int [] arr={1,2,3,4};
int[] result=new int[arr.length];
int total=0;
for(int i=0;i<arr.length;i++){
    total+=arr[i];
    result[i]=total;
}
for(int num:result){
System.out.println(num);
    }
}
}
