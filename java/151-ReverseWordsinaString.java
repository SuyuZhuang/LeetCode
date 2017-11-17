// Input: "the sky is blue"
// Output: "blue is sky the"
public class Solution {
    public static void reverse(String[] words,int i,int j){
        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
            
        }
    }
    
    
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        reverse(words,0,words.length-1);
        StringBuffer buf = new StringBuffer();
        for (int i=0; i<words.length; i++){
            buf.append(words[i].trim()).append(" ");
        }
        buf.delete(buf.length()-1,buf.length());
        return buf.toString();
    }
}
