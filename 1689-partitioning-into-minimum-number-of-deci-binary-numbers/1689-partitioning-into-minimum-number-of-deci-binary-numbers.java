class Solution {
    public int minPartitions(String n) {
       int max=0;
        for(int i=0;i<n.length();i++){
            int x=Character.getNumericValue(n.charAt(i));
            if(x>max)max=x;
        }
        return max;
    }
}