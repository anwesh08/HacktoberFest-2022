class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int sum=0;
        Set<Integer> total=new HashSet<>();
        total.add(0);
        for(int i=0;i<n;i++){
           sum+=arr[i];
           if(total.contains(sum)){
               return true;
           }
           total.add(sum);
       }
       return false;
    }
}