class Solution {
    public int maxSubArray(int[] nums) {
      int i=0;int j=0;int sum=0;int maxsum=nums[0];
      while(j<nums.length && i<nums.length){
         while(sum>=0 && j<nums.length){
           sum+=nums[j];
           j++;
             maxsum=Math.max(maxsum,sum);
         }
         sum-=nums[i];
         i++;
      }
     return maxsum;
    }
}
