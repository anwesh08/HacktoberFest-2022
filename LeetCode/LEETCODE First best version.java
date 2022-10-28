public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int s =1;
        int e =n;
        int ans =n;
        while(s<=e){
            int mid = (s-e)/2+e;
            if(isBadVersion(mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
        
    }
        
    }
