public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        for (int i = 1; i < A.size(); i = i + 2) {
            if (i > 0 && (A.get(i - 1) > A.get(i))) {
                Collections.swap(A, i, i - 1);
            }
            if (i < A.size() - 1 && (A.get(i) < A.get(i + 1))) {
                Collections.swap(A, i, i + 1);
            }
        }
        return A;
    }
}