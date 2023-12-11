import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        //int s = 1001;
        int s = 0;
        int m = 0;
        int l = 0;
        
//         for(int i=0; i<sides.length; i++){

//             if(s > sides[i])
//                 s = sides[i];
//             if(l < sides[i])
//                 l = sides[i];
//         }
        
        Arrays.sort(sides);
        s = sides[0];
        m = sides[sides.length/2];
        l = sides[2];
        
        if(l < (s+m))
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}