import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "";
        String s1 = "";
        s = Long.toString(n);
        
        char c[] = s.toCharArray();
        Arrays.sort(c);
        s1 = String.valueOf(c);
        
        String reverse = "";
        for (int i = s1.length() - 1; i >= 0; i--) {            
            reverse = reverse + s1.charAt(i);        
        }
        
        answer = Long.valueOf(reverse);
        return answer;
    }
}