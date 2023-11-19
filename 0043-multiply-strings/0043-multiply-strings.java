class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length(), m = num2.length();
        int[] res = new int[n + m];

        // Reverse input strings
        StringBuilder reversedNum1 = new StringBuilder(num1).reverse();
        StringBuilder reversedNum2 = new StringBuilder(num2).reverse();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int digit = (reversedNum1.charAt(i) - '0') * (reversedNum2.charAt(j) - '0');
                res[i + j] += digit;
                res[i + j + 1] += res[i + j] / 10;
                res[i + j] %= 10;
            }
        }

        int start = res.length - 1;
        while (start >= 0 && res[start] == 0) {
            start--;
        }

        StringBuilder outputBuilder = new StringBuilder();
        for (int i = start; i >= 0; i--) {
            outputBuilder.append(res[i]);
        }

        return outputBuilder.toString();
    }
}


/*
    Time Complexity: O(n*m)
    Space Complexity: O(n+m)
*/