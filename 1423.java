class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length-1;
        int size=cardPoints.length-k;
        
        int i=0;int j=0;
        long total=0;
        for(int l=0;l<=n;l++){
            total+=cardPoints[l];
        }
       long minsum = Long.MAX_VALUE;long sum=0;
        while(j<=n && i<=n){
            while(j-i<size){
                sum+=cardPoints[j];
                j++;
            }
            if(j-i==size){
                minsum=Math.min(minsum,sum);
            }
            sum-=cardPoints[i];
            i++;
        }
      return (int)(total-minsum);

    }
}
