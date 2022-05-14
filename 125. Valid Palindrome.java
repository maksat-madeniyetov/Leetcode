class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        
        while (l < r) {
            
            // l is alpha numeric
            while (l < r && !isAlphaNumeric(s.charAt(l))) {
                l++;
            }
            
            // r is alpha numeric
            while (l < r && !isAlphaNumeric(s.charAt(r))) {
                r--;
            }
            
            if (Character.toLowerCase(s.charAt(l)) != 
               Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            
            l++;
            r--;
            
        }
        
        return true;
    }
    
    private boolean isAlphaNumeric(char c) {
        return (('a' <= c) && (c <= 'z')) || 
            (('A' <= c) && (c <= 'Z')) || 
            (('0' <= c) && (c <= '9'));
    }
    
}
