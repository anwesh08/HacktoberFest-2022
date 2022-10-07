class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = -1;
        for(int i = arr.length-1 ; i >=0; i--){
            int temp = arr[i];
            arr[i] = max; // assigning last element to -1 in first iteration
            if( max < temp)
                max = temp;
        }
        return arr;
    }
}
