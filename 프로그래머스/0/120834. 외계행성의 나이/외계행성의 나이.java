class Solution {
    public String solution(int age) {
        String answer = "";
        char abc[] = new char[26];
        int j=0;
        
        for(char i = 'a'; i<='z'; i++, j++){
            abc[j] = i;
        }
        
        while(age > 0){
            answer = abc[age%10] + answer;
            // 앞이 더 큰 자리수이기 때문에 answer 뒤에 들어감
            age /= 10;
        }
        
        
        return answer;
    }
}