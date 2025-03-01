import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());    // 우선순위 큐 정렬 반대로     
        for(int i : works){
            pq.add(i);
        }
        
        for(int i=0; i<n; i++){
            if(pq.isEmpty()) break;
            int v = pq.poll()-1;
            if(v > 0){
                pq.add(v);
            }
        }
        
        long answer = 0;
        while(!pq.isEmpty()){
            int v = pq.poll();
            answer += v*v;
        }
        return answer;
    }
}