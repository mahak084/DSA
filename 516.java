class Solution {
    int[][] dp;
    public int subseq(String s,int left,int right){
        if(left==right){return dp[left][right]=1;}
        if(left>right){return 0;}
        if(dp[left][right]!=-1){return dp[left][right];}
        if(s.charAt(left)==s.charAt(right)){
           return dp[left][right]= 2+subseq(s,left+1,right-1);
        }else{
            return dp[left][right]= Math.max(
                subseq(s,left+1,right),
                subseq(s,left,right-1)
            );
        }
    }

    public int longestPalindromeSubseq(String s) {
        dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
           Arrays.fill(dp[i],-1); 
        }
        return subseq(s,0, s.length() - 1);
         
    }
}
