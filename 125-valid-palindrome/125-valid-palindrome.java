class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<2)return true;
        int start=0;
        int end=s.length()-1;
        StringBuilder x=new StringBuilder(s);
        while (start<end){
            char cs=x.charAt(start);
            char ce=x.charAt(end);
            if(Character.isUpperCase(cs))
                cs=x.replace(start,start+1, String.valueOf(Character.toLowerCase(cs))).charAt(start);
            if(Character.isUpperCase(ce))
                ce=x.replace(end,end+1, String.valueOf(Character.toLowerCase(ce))).charAt(end);
            if(!Character.isLetterOrDigit(cs))   start++;
            else if(!Character.isLetterOrDigit(ce))   end--;
            else if(cs!=ce) return false;
            else {start++;end--;}

        }
        return true;
    }
}