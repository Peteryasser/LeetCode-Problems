class Solution {
    public boolean isPowerOfThree(int n) {
        int numOfThrees=(int)Math.round((Math.log(n)/Math.log(3)));
        return (n>0&&Math.pow(3,numOfThrees)==n);
    }
}