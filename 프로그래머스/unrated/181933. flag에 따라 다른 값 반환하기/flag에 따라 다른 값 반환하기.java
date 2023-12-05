class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true)
            return a+b;
        if(flag == false)
            return a-b;
        return answer;
    }
}