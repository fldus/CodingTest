class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i< quiz.length; i++){
            String[] s = quiz[i].split(" ");
            int n = Integer.parseInt(s[0]);
            if(s[1].equals("+"))
                n += Integer.parseInt(s[2]);
            else
                n -= Integer.parseInt(s[2]);
            
            if(s[4].equals(String.valueOf(n)))
                answer[i] = "O";
            else 
                answer[i] = "X";
        }//for
        
        return answer;
    }
}