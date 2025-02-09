class Solution {
    public int reverse(int x) {
        int k = x;
        int n = 0;
        while(k != 0){
            int d = k % 10;
            int res = n * 10 + d;
            if((res - d)/10 != n) return 0;
            n = res;
            k = k / 10;
        }
        return n;
    }
}