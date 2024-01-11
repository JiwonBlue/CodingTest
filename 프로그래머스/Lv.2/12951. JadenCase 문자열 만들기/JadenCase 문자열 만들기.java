class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        if((97 <= arr[0]) && (arr[0] <=122))
            arr[0] -= 32;

        for(int i=1; i<s.length(); i++){
            
            if((97 <= arr[i]) && (arr[i] <=122) && (arr[i-1] == ' '))
                arr[i] -= 32;
            
            if((65 <= arr[i]) && (arr[i] <=90) && (arr[i-1] != ' '))
                arr[i] += 32;
        }
        answer = String.valueOf(arr);
        return answer;
    }
}