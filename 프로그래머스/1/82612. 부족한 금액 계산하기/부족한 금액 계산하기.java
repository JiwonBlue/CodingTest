class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long countPrice = 0;
        
        for(int i = 1; i <= count; i++){
            countPrice = countPrice + (i * price);
        }
        
        if((money - countPrice) >= 0)
            answer = 0;
        else
            answer = (money - countPrice) * -1;
        
        return answer;
    }
}