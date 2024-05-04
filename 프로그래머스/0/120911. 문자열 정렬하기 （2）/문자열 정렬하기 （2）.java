class Solution {
    public String solution(String my_string) {
        String answer = "";
		String[] s = my_string.toLowerCase().split("");
        for(int i=0 ; i< s.length; i++){
            for(int j=i+1; j< s.length;j++){
            	if(s[i].compareTo(s[j]) > 0){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
            answer += s[i];
        }
        
        return answer;
    }
}