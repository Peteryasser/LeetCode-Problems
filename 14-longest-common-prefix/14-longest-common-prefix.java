class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        int min=0;
        if(strs[0].length()<strs[strs.length-1].length()) min=strs[0].length();
        else min=strs[strs.length-1].length();
        while (i<min&&strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            i++;
        return strs[0].substring(0,i);
    }
}