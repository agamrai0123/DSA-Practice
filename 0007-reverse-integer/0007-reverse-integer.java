class Solution {
    public int reverse(int x) {
        int n = x;
        int res = 0;

        while (n != 0) {
            int d = n % 10;
            int result = res * 10 + d;
            if ((result - d) / 10 != res)
                return 0;
            res = result;
            n = n / 10;
        }

        return res;
    }
}
