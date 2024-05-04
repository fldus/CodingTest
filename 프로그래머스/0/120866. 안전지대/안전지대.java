class Solution {
    public int solution(int[][] board) {
        int answer=0;
        int[][] map = new int [board.length+2][board[0].length+2];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==1){
                    for(int n=0; n<3; n++)
                        for(int m=0; m<3; m++)
                            map[i+n][j+m] = 1;
                }//if
            }
        }
        
        for(int i=1; i<board.length+1; i++){
            for(int j=1; j<board.length+1; j++)
                if(map[i][j] == 0)
                    answer ++;
        }
        
        return answer;
    }
}