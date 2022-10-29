public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int room = 0, j = 0;
        for (int i = 0; i < arrive.size(); i++) {
            if (arrive.get(i) <= depart.get(j)) {
                room++;
            } else {
                j++;
            }
        }
        return room <= K;
    }
}