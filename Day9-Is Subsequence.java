class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == 0)  
            return true; 
        if (n == 0)  
            return false; 
        if (s.charAt(m-1) == t.charAt(n-1)) 
            return isSubsequence(s.substring(0,m-1), t.substring(0,n-1)); 
        return isSubsequence(s, t.substring(0,n-1)); 
    }
}
