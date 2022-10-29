public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = true;
        // int max = Integer.MIN_VALUE;
        // for (int i = A.size() - 1; i >= 0; i--) {
        //     if (A.get(i) > max) {
        //         ans.add(A.get(i));
        //         max = A.get(i);
        //     }
        // }
        // return ans;
        ans.add(A.get(A.size() - 1));
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) < A.get(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                ans.add(A.get(i));
            } else {
                flag = true;
            }
        }
        return ans;
    }
}