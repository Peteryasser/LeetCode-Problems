class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] resodd = new int[nums.length/2],reseven = new int[nums.length/2];
        int oddcount=0,evencount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1) //odd
                resodd[oddcount++]=nums [i];
            else
                reseven[evencount++]=nums[i];
        }
        oddcount=0;evencount=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==1)
               nums[i]=resodd[oddcount++];
            else
                nums[i]=reseven[evencount++];
        }
        return nums;
    }
}