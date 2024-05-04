class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer=0, cnt;
        for(int i=0; i<dic.length; i++){
        	cnt=0;
            for(int j=0; j<spell.length; j++){
            	if(dic[i].contains(spell[j]))
            		dic[i] = dic[i].replaceFirst(spell[j],"");
            	else
            		cnt++;
            }
            System.out.println(dic[i]);
            if(dic[i].equals("") && cnt==0) answer++;
        }
        
        if(answer > 0)
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}