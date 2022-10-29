class Solution{
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        // int ans = 0;
        // for (int i = 0; i < N; i++) {
        //     for (int j = i; j < N; j++) {
        //         int sum = 0;
        //         for (int k = i; k <= j; k++) {
        //             sum += A[i];
        //         }
        //         if (sum == K) {
        //             ans = Math.max(ans, j - i + 1);
        //         }
        //     }
        // }
        // return ans;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i = 0; i < N; i++)
        {
            sum += A[i];
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
            if(sum==K){
                count=i+1;
            }
            if(map.containsKey(sum-K)){
                count=Math.max(count,i-map.get(sum-K));
            }
        }
        return count;
    }
}