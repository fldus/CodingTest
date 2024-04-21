class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        
        for(int i=1; i<k; i++){
            if(answer+2 > numbers.length)
                answer = (answer+2)-numbers.length;
            else 
                answer = answer+2;
        }
        
        return answer;
    }
}