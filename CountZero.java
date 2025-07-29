class CountZero{
    public static void main(String args[]){
        int n=102020305;
        int count=countZeroes(n);
        System.out.print(count);
    }
    public static int countZeroes(int n){
        if (n == 0) return 0;
        int lastDigit = n % 10;
        if (lastDigit == 0) {
            return 1 + countZeroes(n / 10);
        } else {
            return countZeroes(n / 10);
        }
    }
}
