class Solution {
    public int[] solution(int[][] score) {
        int[] num = new int[score.length];
        for(int i=0; i< num.length; i++){
            num[i] = score[i][0] + score[i][1];
        }
        
        int[] answer = new int[num.length];
        int cnt;
        for(int i=0; i< num.length; i++){
            cnt=1;
            for(int j=0; j<num.length; j++)
                if(num[i] < num[j]) cnt++;
            answer[i] = cnt;
        }
            
        return answer;
    }
}