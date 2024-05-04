import java.util.*;
class Solution {
    public String solution(String polynomial) {
        int x=0, n=0;
        for(String s:polynomial.split(" ")){
        	if(s.contains("x")) {
        		if(!s.equals("x"))
        			x+= Integer.parseInt(s.replace("x", ""));
        		else 
        			x += 1;
        	}
        	else if(!s.equals("+")) {
        		n += Integer.parseInt(s);
        	}
        }
        
        
        String answer = "";
        if(x!=0) {
        	if(x == 1)
        		answer += "x";
        	else
        		answer += String.valueOf(x) + "x";
        	if(n != 0)
        		answer += " + ";
        }
        if(n!=0)
        	answer += String.valueOf(n);
        
        return answer;
    }
}