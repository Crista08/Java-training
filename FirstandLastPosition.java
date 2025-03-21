class FirstandLastPosition{
	public static void main(String args[]) {
		int[] n= {1,2,3,3,4,5};
		int target=3;
		int fp=findfp(n,target);
		int sp=findsp(n,target);
		System.out.println("Result: ["+fp+","+sp+"]");
	}
	static int findfp(int[] n,int target){
	    for(int i=0;i<n.length;i++){
	        if(n[i]==target){
	            return i;
	        }
	    }
	    return -1;
	}
	static int findsp(int[] n,int target){
	    for(int i=n.length-1;i>=0;i--){
	        if(n[i]==target){
	            return i;
	        }
	    }
	    return -1;
	}
}