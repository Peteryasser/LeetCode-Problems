class Solution {
    public void moveZeroes(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                while (j<nums.length&&nums[j]==0)j++;
                if(j>=nums.length)return;
                exchange(nums,i,j);
                j++;
            }
            else j++;
        }
    }
    private void exchange(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}