class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pop = new int[101];
        for (int i = 0; i < logs.length; i++) {
            pop[logs[i][0] - 1950]++;
            pop[logs[i][1] - 1950]--;
        }
        for (int i = 1; i < 101; i++) {
            pop[i] += pop[i - 1];
        }
        int maxVal = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++){
            if (maxVal < pop[i]) {
                maxVal = pop[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}