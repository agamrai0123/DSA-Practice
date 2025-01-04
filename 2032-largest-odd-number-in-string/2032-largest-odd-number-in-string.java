class Solution {
    public String largestOddNumber(String num) {
        int l = num.length();
        if(num.charAt(l-1) % 2 == 1) return num;
        for(int i = l-1; i >= 0; i--){
            if(num.charAt(i) % 2 == 1) return num.substring(0,i+1);
        }
        return "";
    }
}