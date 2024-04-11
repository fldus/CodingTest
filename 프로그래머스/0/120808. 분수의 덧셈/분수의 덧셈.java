class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a, b, num = 1;
        a = (numer1*denom2) + (numer2*denom1);  // 분자
        b = denom1 * denom2;    // 분모
        
        for(int i=1; i<=a && i<=b; i++) // 최대 공약수
            if(a%i==0 && b%i==0) num = i;
        
        answer[0] = a/num;
        answer[1] = b/num;
        
        return answer;
    }
}