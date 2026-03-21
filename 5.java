class Solution {

public String expand(String s,int left,int right){
    while(left>=0 && right<s.length() && left<=right && s.charAt(left)==s.charAt(right)){
        left--;right++;
    }
    return s.substring(left+1,right);
}

    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String ans1=expand(s,i,i);
            String ans2=expand(s,i,i+1);
            int len1=ans1.length();
            int len2=ans2.length();
            if(ans.length()<len1){
                ans=ans1;
            }
            if(ans.length()<len2){ans=ans2;}
           
        }
        return ans;
     
}}
