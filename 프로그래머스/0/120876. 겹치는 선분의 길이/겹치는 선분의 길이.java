class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] ln = new int[201];
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++)
                ln[j]++;
        }
        for(int i=0; i<ln.length; i++)
            if(ln[i] > 1)
                answer++;
        
        return answer;
    }
}