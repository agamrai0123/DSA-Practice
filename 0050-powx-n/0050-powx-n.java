class Solution {
    public double myPow(double x, int n) {
        return binaryExp(x, (long) n);
    }

    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1/x;
            n = -n;
        }

        if (n % 2 == 1) {
            return x * binaryExp(x * x, n / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
    }
}