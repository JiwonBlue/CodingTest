import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                answer[i] = i - map.get(ch);
            }else{
                answer[i] = -1;
            }
            map.put(ch, i);
        }
        return answer;
    }
}

// 문자를 맵에다가 등장한 문자와 등장했던 인덱스로 넣는다.
// 다음문자 검색시 맵에 비교. 
// constains로 존재하면 밸류값 찾아서 현재인덱스 - 밸류값