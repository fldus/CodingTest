class Solution {
    static boolean[] check;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!check[i]){
                dfs(computers, i, n);
                answer++;
            }
        }
        return answer;
    }
    
    static void dfs(int computers[][], int i, int n){
        check[i] = true;
        
        for(int j=0; j<n; j++){
            if(check[j] == false && computers[i][j] == 1){
                dfs(computers, j, n);
            }
        }
    }
}