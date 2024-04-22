import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        List<Integer> cnli = new ArrayList<>();
        int cnt;
        
        for(int i=2; i<=n; i++){
            if(n%i==0)
                list.add(i);
        }   // 약수 찾기
        
        for(int i=0; i<list.size(); i++){
            cnt=0;
            for(int j=2; j<=list.get(i); j++){
                if(list.get(i)%j == 0)
                    cnt++;
            }
            if(cnt == 1)    // 약수 1개(소인수)
                cnli.add(list.get(i));
        }
            
        int[] answer = new int[cnli.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = cnli.get(i);
        
        return answer;
    }
}