import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i< arr.length; i++ ){
            if(stk.isEmpty())
                stk.push(arr[i]);
            else{
                if(arr[i] == stk.peek())
                    stk.pop();
                else
                    stk.push(arr[i]);
            }
        }
        if(stk.isEmpty())
            stk.push(-1);
        return stk.stream().mapToInt(i->i).toArray();
    }
}