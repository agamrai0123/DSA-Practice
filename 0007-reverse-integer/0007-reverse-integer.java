class Solution {
    public int reverse(int x) {
        int k = 0;
        boolean neg = false;
        if( x > 0 ){
            k = x;
            neg = false;
        }
        else{
            k = -x;
            neg = true;
        }
        int n = 0;
        while(k > 0){
            int d = k % 10;
            n = n * 10 + d;
            k = k / 10;
        }
        if(neg){
            return -n;
        }
        else return n;
    }
}