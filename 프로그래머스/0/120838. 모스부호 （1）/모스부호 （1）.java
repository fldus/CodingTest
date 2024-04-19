class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mose = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char ch = 'a';
        
        String[] sp = letter.split(" ");
        for(int i=0; i< sp.length; i++){
            for(int j=0; j<mose.length; j++)
                if(sp[i].equals(mose[j]))
                    answer += (char)(ch+j);
        }
        return answer;
    }
}