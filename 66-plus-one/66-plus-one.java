class Solution {
    public int[] plusOne(int[] digits) {
        boolean needNewArray=true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]==9) {
                digits[i] = 0;
            } else {
                digits[i] ++;
                needNewArray=false;
                break;
            }
        }
        if (needNewArray) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                result[i]=0;
            }
            return result;
        }
        return digits;
    }
}