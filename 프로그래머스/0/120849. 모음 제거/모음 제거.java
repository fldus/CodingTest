class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
        	char ch = my_string.charAt(i);
            if( 'a'==ch || 'e'==ch || 'i'==ch || 'o'==ch || 'u'==ch)
            		answer += "";
            else answer += my_string.charAt(i);
        }   
        
        return answer;
    }
}