class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a,b;
        
        if(dots[0][0] == dots[1][0]){
            a = dots[0][0] - dots[2][0];
        }else
            a = dots[0][0] - dots[1][0];
        
        if(dots[0][1] == dots[1][1]){
            b = dots[0][1] - dots[2][1];
        }else
            b = dots[0][1] - dots[1][1];
        
        if(a < 0) a *= -1;
        if(b < 0) b *= -1;
        
        answer = a*b;
        
        return answer;
    }
}