class Solution {
    public int solution(int n) {
        int answer = 0;
        int k;
        
        for(int i=1; i<=n; i++){
            k=0;
            for(int j=1; j<=i; j++)
                if(i%j == 0) k++;
            if(k >= 3) answer++;
        }
            
        return answer;
    }
}