import java.util.*;
class Solution {
    public int solution(String my_string) {
        for(int i=0; i< my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isAlphabetic(ch))
            	my_string = my_string.replace(ch, ' ');
        }
        
		StringTokenizer st = new StringTokenizer(my_string, " ");
		int answer = 0;
		while(st.hasMoreTokens()) {
			answer += Integer.parseInt(st.nextToken());
		}
        
        return answer;
    }
}