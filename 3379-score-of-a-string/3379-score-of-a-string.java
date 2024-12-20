class Solution {
    public int scoreOfString(String s) {
        int n= 0;
        int len = s.length();
        for(int i = 0; i<len-1; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            int diff = Math.abs((int)ch1 - (int)ch2);
            n = n + diff;
        }
        return n;
    }
}