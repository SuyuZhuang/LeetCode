// 暴力算法，Time Limit Exceeded 超时,O(n^3)
class Solution {
     public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        for (int i=0; i<n; i++){
            for (int j = i+1; j<=n; j++){
                if (containsChar(s,i,j)){ result = Math.max(result,j-i);}
            }
        }
        
        return result;
    }
    
    public boolean containsChar(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start;i<end; i++){
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}

// Sliding Window，使用SET集合,54ms
class Solution {
     public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int result = 0;
        int i=0, j=0;
        Set<Character> set = new HashSet<>();
        while (i<n && j<n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                result = Math.max(result,j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        
        return result;
    }
}
