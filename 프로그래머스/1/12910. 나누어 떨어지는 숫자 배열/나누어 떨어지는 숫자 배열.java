import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> li = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0)
                li.add(i);
        }
        
        if(li.isEmpty())
            return new int[] {-1};
        
        int[] answer = li.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}