class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int num;
        
        for(int i=0; i< emergency.length; i++){
            num = 1;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] < emergency[j]) num ++;
            }
            answer[i] = num;
        }
        
        return answer;
    }
}