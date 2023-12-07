class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split("\\s");
        int[] intArray = new int[ss.length];
        int min = 0;
        int max = 0;
        
        for(int i = 0; i < ss.length; i++){
            intArray[i] = Integer.parseInt(ss[i]);
        }
        
        min = intArray[0];
        max = intArray[0];
        
        for(int j = 0; j < intArray.length; j++){
            if(min > intArray[j])
                min = intArray[j];
            
            if(max < intArray[j])
                max = intArray[j];
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        //return intArray[0];
        return answer;
    }
}