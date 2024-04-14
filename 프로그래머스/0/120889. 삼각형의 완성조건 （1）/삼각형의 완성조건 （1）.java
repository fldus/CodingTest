class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max =0;
        
        for(int i=0; i< 3; i++)
            if(sides[max] < sides[i]) max = i;
       
        if(max == 0){
            if(sides[0] < sides[1] + sides[2])
                answer = 1;
            else answer = 2;
        }else if(max==1){
            if(sides[1] < sides[0] + sides[2])
                answer = 1;
            else answer = 2;
        }else{
            if(sides[2] < sides[1] + sides[0])
                answer = 1;
            else answer = 2;
        }
            
        return answer;
    }
}