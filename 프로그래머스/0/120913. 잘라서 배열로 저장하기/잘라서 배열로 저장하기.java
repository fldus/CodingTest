class Solution {
    public String[] solution(String my_str, int n) {
        int len;
        if(my_str.length()%n != 0)
            len = (my_str.length() / n) + 1;
        else
            len = my_str.length() / n;
        
        String[] answer = new String[len];
        answer[0] = "";
        int cnt=0, a=0;
        for(int i=0; i< my_str.length(); i++){
            if(cnt == n){
                a++;
                answer[a] = "";
                cnt=0;
            }
            answer[a] += my_str.charAt(i);
            cnt++;
            
        }
        return answer;
    }
}