class Solution {
    public int solution(int n) {
        int answer = 0;
        int i, sum = 1;
        
        for(i=1; sum <= n; i++){
            sum *= i;
        }
        answer = i-2;
        
        return answer;
    }
}