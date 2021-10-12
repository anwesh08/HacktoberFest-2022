class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val1 = num(s.charAt(i));
            if (s.length() > i + 1) {
                int val2 = num(s.charAt(i + 1));
                if (val1 >= val2) {
                    sum += val1;
                }
                else {
                    sum += val2 - val1;
                    i++;
                }
            } else {
                sum += val1;
            }
        }
        return sum;
    }
    public int num(char s) {
        if (s == 'I')
            return 1;
        if (s == 'V')
            return 5;
        if (s == 'X')
            return 10;
        if (s == 'L')
            return 50;
        if (s == 'C')
            return 100;
        if (s == 'D')
            return 500;
        if (s == 'M')
            return 1000;
        return -1;
    }
}