import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        //int sum = 0;
        
        String ns = String.valueOf(n);
        char[] nsc = ns.toCharArray();
        
        for(int i=0; i<nsc.length; i++){
            answer += Character.getNumericValue(nsc[i]);
            //System.out.println(Character.getNumericValue(nsc[i]));
        }

        return answer;
    }
}