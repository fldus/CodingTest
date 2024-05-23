import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int n=0;
        for(int i=0; i<10; i++){
            if(n == numbers.length){
                for(int j=i; j<10; j++)
                    answer += j;
                break;
            }
            if(numbers[n] != i)
                answer += i;
            else n++;
        }
        return answer;
    }
}