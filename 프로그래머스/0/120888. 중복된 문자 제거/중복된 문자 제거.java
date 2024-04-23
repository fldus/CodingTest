class Solution {
    public String solution(String my_string) {
        String answer = "";
        int cnt =0;
        
        for(int i=0; i<my_string.length(); i++){
            char si = my_string.charAt(i);
            
            for(int j=i; j>=0; j--){
                char sj = my_string.charAt(j);
                if(si == sj)
                    cnt++;
            }
            if(cnt == 1)
                answer += si;
            cnt=0;
        }
        
        return answer;
    }
}