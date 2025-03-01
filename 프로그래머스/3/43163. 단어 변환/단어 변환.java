class Solution {
    static boolean[] check;
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }
    
    static void dfs(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }
        
        for(int i=0; i<words.length; i++){
            if(!check[i]){
                int same = 0;   // 같은 스펠링 수
                for(int j=0; j<begin.length(); j++){
                    if(begin.charAt(j) == words[i].charAt(j))
                        same++;
                }
                
                if(same == begin.length()-1){
                    check[i] = true;
                    dfs(words[i], target, words, cnt+1);
                    check[i] = false;
                }
            }
        }
    }
}