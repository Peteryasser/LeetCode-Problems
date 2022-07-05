class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        int l=columnTitle.length()-1;
        for(int i=l;i>=0;i--){
            result+=(columnTitle.charAt(i)-'A'+1)*Math.pow(26,l-i);
        }
        return result;
    }
}