import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length-1 == 0)   // return 배열이 비었을 때
            return new int[] {-1};
        // 최소값 찾기
        int min = arr[0];
        for(int i=1; i<arr.length; i++)
            if(min > arr[i]) min = arr[i];
        // 최소값 제외한 배열
        int[] answer = new int[arr.length-1];
        int j=0;
        for(int i=0; i<arr.length; i++)
            if(arr[i] != min){
                answer[j] = arr[i];
                j++;
            }
        
        return answer;
    }
}