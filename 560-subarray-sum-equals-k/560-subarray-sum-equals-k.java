class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1);
        int result = 0;

        int sum = 0;
 
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int r=sum-k;
            if (map.containsKey(r))
                result += map.get(r);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}