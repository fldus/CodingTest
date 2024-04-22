import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.split("");
        String num = "";
        
        int cnt=0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<10; j++){
                num = Integer.toString(j);
                if(num.equals(arr[i])){
                    cnt++;
                    list.add(j);
                }
            }// for j
        }// for i
        
        int[] answer = new int[cnt];
        for(int i=0; i<cnt; i++)
            answer[i] = list.get(i);
        
        Arrays.sort(answer);    // 정렬
        
        return answer;
    }
}