class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=nums1.length;
        int j=nums2.length;
        int idx =0;
        int[]arr3=new int [i+j];
        for(int x=0;x<i;x++){
            arr3[idx]=nums1[x];
            idx++;
            
        }
        for(int x=0;x<j;x++){
            arr3[idx]=nums2[x];
            idx++;
            
        }
        
        Arrays.sort(arr3);
     
        int n=arr3.length;
        if(n%2==0){
            int a=n/2;
            double e=arr3[a];
            double f=arr3[a-1];
           
             double ans=(e+f)/2;
            return ans;
        }
        else{
            int a=Math.round(n/2);
            return arr3[a];
        }
    }
    
}
