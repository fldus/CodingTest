class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        for(int i=1; i<=b ;i++){
            if(a%i==0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        while(true){
            if(b%2 == 0)
                b/=2;
            else if(b%5 == 0)
                b/=5;
            else 
                break;
        }
        
        if(b == 1) answer = 1;
        else answer = 2;
        
        return answer;
    }
}