class Solution {
    public String longestPalindrome(String s) {
     return palindrome(s,0,s.length());   
    }
    
    public static int palindrome(String s,int i , int n){
        if(i==n){
            return 0;
        }
        int len=Integer.min_value;
        for(int k =i;k<=n-1;k++)
        {
        if(Palindrome(s,i,k)){
            len=k-i+1;
        } 
            len=Math.max(len,palindrome(s,k+1,n));
        } 
        return len;
    }
     public static boolean Palindrome(String s , int i , int j){
        String s1=s.substring(i,Math.min(j+1,s.length()));
        int l=0;
        int r=s1.length()-1;
        while(l<=r){
            if(s1.charAt(l)!=s1.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
