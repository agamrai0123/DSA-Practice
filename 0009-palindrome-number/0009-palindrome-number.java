class Solution {
    public boolean isPalindrome(int x) {
        int k = x;
        int n = 0;
        while(k > 0){
            int d = k % 10;
            n = n * 10 + d;
            k = k /10;
        }
        if(x == n) return true;
        else return false;
    }
}