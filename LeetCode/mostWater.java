import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int start=0, end=height.length-1;
        while(start<end){
            int l= end-start;
            int b;
            if(height[start]>height[end]){
                b= height[end];
                end--;
            }
            else{
                b= height[start];
                start++;
            }
            maxarea= Math.max(maxarea, l*b);
            
        }
        return maxarea;
    }
}
public class mostwater {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Print a1");
        int size1= Integer.parseInt(br.readLine());
        int arr1[]= new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i]= Integer.parseInt(br.readLine());
        }
        Solution s= new Solution();
        int a= s.maxArea(arr1);
        System.out.println(a);
    }
}
