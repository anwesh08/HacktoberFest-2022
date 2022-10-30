class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            
            if(i==0||nums[i]!=nums[i-1]){
                
                int lo=i+1;
                int hi=nums.length-1;
                while(lo<hi){
                    int sum=nums[lo]+nums[hi];
                    int target=0-nums[i];
                    if(sum==target){
                        List<Integer> a=new ArrayList<>();
                        a.add(nums[lo]);
                        a.add(nums[hi]);
                        a.add(nums[i]);
                        arr.add(a);
                        while(lo<nums.length-1&&nums[lo]==nums[lo+1])lo++;
                        while(hi>0&&nums[hi]==nums[hi-1])hi--;
                        lo++;
                        hi--;}
                        else if(sum<target){
                            lo++;
                        }
                        else{
                            hi--;
                        }
                    }
                }
                
                
            }
        
        
      return arr;  
        
    }
}