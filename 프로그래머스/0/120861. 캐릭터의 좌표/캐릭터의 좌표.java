class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int x=0, y=0;
        for(String s:keyinput){
            if(s.equals("left")){
                x--;
                if(x < -(board[0]/2))
                    x = -(board[0]/2);
            }else if(s.equals("right")){ 
                x++;
                if(x > board[0]/2)
                    x = board[0]/2;
            }else if(s.equals("up")){
                y++;
                if(y > board[1]/2)
                    y = board[1]/2;
            }else{
                y--;
                if(y < -(board[1]/2))
                    y = -(board[1]/2);
            }
        }
        
        answer[0] += x;
        answer[1] += y;
            
        return answer;
    }
}