class Solution {
    
    public void helper(List<String> res,int open,int close,int n,String str){
        
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        
        if(open<n)
            helper(res,open+1,close,n,str+"(");
        if(close<open)
             helper(res,open,close+1,n,str+")");
    }
    public List<String> generateParenthesis(int n) {
        
        List<String> res=new ArrayList<>();
        helper(res,0,0,n,"");
        return res;
    }
}