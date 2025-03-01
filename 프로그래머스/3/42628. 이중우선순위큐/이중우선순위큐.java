import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> up = new PriorityQueue<>();
        PriorityQueue<Integer> down = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s : operations){
            String[] str = s.split(" ");
            int num = Integer.parseInt(str[1]);
            
            if(str[0].equals("I")){
                up.add(num);
                down.add(num);
            }else if(up.size() > 0){
                if(num == 1){
                    int max = down.poll();
                    up.remove(max);
                }else{
                    int min = up.poll();
                    down.remove(min);
                }
            }
        }
        
        int[] answer = {0, 0};
        if(!up.isEmpty()){
            answer[0] = down.poll();
            answer[1] = up.poll();
        }
        
        return answer;
    }
}