class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
        	int min = i;
        	for(int j=i+1; j<numlist.length; j++){
            	int ni = numlist[min]-n;
        		int nj = numlist[j]-n;
                if(ni < 0) ni *= -1;
                if(nj < 0) nj *= -1;
                
                if(ni > nj) {
                	min = j;
                }else if(nj==ni) {
                	if(numlist[min]-n < 0)
                		min = j;
                }
            }
        	int temp = numlist[i];
        	numlist[i] = numlist[min];
        	numlist[min] = temp;
        	
            answer[i] = numlist[i];
        }
        
        return answer;
    }
}