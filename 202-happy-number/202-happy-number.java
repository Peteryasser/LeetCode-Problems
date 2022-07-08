class Solution {
    public int getNext(int n) {
        int sum=0;
        while (n>0) {
            sum+=((n%10)*(n%10));
            n=n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }
}