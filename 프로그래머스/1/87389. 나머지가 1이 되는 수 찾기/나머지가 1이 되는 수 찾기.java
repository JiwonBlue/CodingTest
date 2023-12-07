class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 0;
        for(x=999999; x>=2; x--){
            if(n%x == 1)
                answer = x;
        }
        return answer;
    }
}