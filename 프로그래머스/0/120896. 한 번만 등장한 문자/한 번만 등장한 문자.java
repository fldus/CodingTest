import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt;
        
        for(int i=0; i<s.length(); i++){
            cnt=0;
            char ch = s.charAt(i);
            for(int j=0; j<s.length(); j++){
                if(ch == s.charAt(j) ) cnt++;
            }
            if(cnt == 1)
                answer += ch;
        }
        
        
        char[] arr = answer.toCharArray();
        answer = "";
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++)
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            answer += arr[i];
        }
        
        return answer;
    }
}