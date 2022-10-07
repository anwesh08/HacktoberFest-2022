import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> List = new ArrayList<>();
        int len = num.length;
        int i = len - 1;
        while(i >= 0 || k > 0) {
            if (i >= 0) {
                List.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                List.add(k % 10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(List);
        return List;
    }
}