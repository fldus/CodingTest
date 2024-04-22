class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("");
        String num = "";
        int answer = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<10; j++){
                num = Integer.toString(j);
                if(num.equals(arr[i]))
                    answer += j;
            }// for j
        }// for i
        
        return answer;
    }
}