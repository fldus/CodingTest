class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int an = 0;
        
        for(int i=0; i<array.length; i++){
            int num = array[i] -n;
            if(num < 0){
                num *= -1;
            }   
            
            if(i==0){
                an = num;
                answer = array[i];
            }else if(an > num ){
                an = num;
                answer = array[i];
            }else if(an == num)
                if(answer > array[i]){
                    an = num;
                    answer = array[i];
                }       
        }
        
        return answer;
    }
}