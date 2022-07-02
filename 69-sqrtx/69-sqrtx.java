class Solution {
    public int mySqrt(int x) {
        long l,mid,start=0,end=x,sol=0;
        while(start<=end){
            l=start+end;
            mid=l/2;
            if(mid*mid==x){
                sol=mid;
                break;
            }
            if(mid*mid<x){
                start=mid+1;
                sol=mid;
            }
            else end=mid-1;
        }
        return (int) sol;
    }
}