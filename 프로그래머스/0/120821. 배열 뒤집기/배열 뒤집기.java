class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=0, j=num_list.length - 1; i<num_list.length; i++, j--) 
            answer[j] = num_list[i];
            
        
        return answer;
    }
}