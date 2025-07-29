class NumberRecursive{
    public static void main(String args[]){
        int n=5;
        printNum(1,n);
    }
    public static void printNum(int curr,int n){
        if (curr > n) return;
        System.out.println(curr+" ");
        printNum(curr + 1, n);
    }
}