class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int xy = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim"))
                xy = i;
        }
        answer = "김서방은 " + xy + "에 있다";
        return answer;
    }
}