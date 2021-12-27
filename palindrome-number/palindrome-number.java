class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        
        int l = 0;
        int r = s.length() - 1;
        
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            else if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
        }
        return true;

    }
}