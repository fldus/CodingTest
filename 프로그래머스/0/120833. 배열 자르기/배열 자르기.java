class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int k = num2-num1 +1;
        int[] answer = new int[k];
        
        for(int i=0; i<k; i++, num1++)
            answer[i] = numbers[num1];
        
        return answer;
    }
}