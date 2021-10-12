class Solution {
    public String intToRoman(int num) {
        String roman = "";
        if (num >= 1 && num <= 3999) {
            int exp = 0;
            while (num != 0) {
                int next = num % 10;
                String x = get_num_rep(next, exp);
                ++exp;
                num /= 10;
                roman = (x + roman);
            }
        }
        return roman;
    }
    public String get_num_rep(int num, int exp) {
        String x = "";
        if (exp >= 0 && exp <= 3) {
            if (num == 4) {
                x = exp == 0 ? "IV" : exp == 1 ? "XL" : "CD";
            } else if (num == 5) {
                x = exp == 0 ? "V" : exp == 1 ? "L" : "D";
            } else if (num == 9) {
                x = exp == 0 ? "IX" : exp == 1 ? "XC" : exp == 2 ? "CM" : "DM";
            } else {
                if (num < 4) {
                    for (int i = 0; i < num; i++) {
                        x += (exp == 0 ? "I" : exp == 1 ? "X" : exp == 2 ? "C" : "M");
                    }
                } else if (num > 5) {
                    x = (exp == 0 ? "V" : exp == 1 ? "L" : "D");
                    for (int i = 5; i < num; i++) {
                        x += (exp == 0 ? "I" : exp == 1 ? "X" : exp == 2 ? "C" : "D");
                    }
                }
            }
        }
        return x;
    }
}