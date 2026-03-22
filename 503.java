class Solution {
    public int[] nextGreaterElements(int[] nums) {
       Stack<Integer> ans=new Stack<>();
       int[] ans1=new int[nums.length];
       Arrays.fill(ans1,-1);
       for(int i=0;i<2*nums.length;i++){
        int ind=i%nums.length;
        while(!ans.isEmpty() && nums[ans.peek()]<nums[ind]){
            ans1[ans.peek()]=nums[ind];
            ans.pop();
        }
        if(i<nums.length){
        ans.push(ind);}
       }
       return ans1; 
    }
}
