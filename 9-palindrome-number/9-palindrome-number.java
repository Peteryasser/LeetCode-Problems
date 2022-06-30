class Solution {
   public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        return check(s);
    }
    public boolean check(String s){
        if(s.length()==0|s.length()==1)return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))return false;
        else return check(s.substring(1,s.length()-1));
    }
}