package com.haciulug;

public class Q12 {
}

class Solution12 {
    public String intToRoman(int num) {
        String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};
        StringBuilder sb = new StringBuilder();
        int i = 6;
        while (num > 0) {
            int div = num / value[i];
            if (div > 0) {
                if (div == 9) {
                    sb.append(roman[i]);
                    sb.append(roman[i + 2]);
                } else if (div >= 5) {
                    sb.append(roman[i + 1]);
                    for (int j = 0; j < div - 5; j++) {
                        sb.append(roman[i]);
                    }
                } else if (div == 4) {
                    sb.append(roman[i]);
                    sb.append(roman[i + 1]);
                } else {
                    for (int j = 0; j < div; j++) {
                        sb.append(roman[i]);
                    }
                }
                num = num % value[i];
            }
            i -= 2;
        }
        return sb.toString();
    }
}