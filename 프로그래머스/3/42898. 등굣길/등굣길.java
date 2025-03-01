class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int num = 1000000007;
        int[][] board = new int[n][m];
        for(int[] pud : puddles){
            board[pud[1]-1][pud[0]-1] = -1;
        }
        
        board[0][0] = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == -1){
                    board[i][j] = 0;
                    continue;
                }
                
                if(i != 0)
                    board[i][j] += board[i-1][j] % num;
                if(j != 0)
                    board[i][j] += board[i][j-1] % num;
            }
        }
        
        return board[n-1][m-1] % num;
    }
}