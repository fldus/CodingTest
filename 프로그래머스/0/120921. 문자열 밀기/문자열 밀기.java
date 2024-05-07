class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] a = A.toCharArray();
        
        for(int i=0; i<A.length(); i++){
        	if(B.equals(String.valueOf(a)))
                break;
            else {
            	for(int j = a.length-1; j>0; j--){
                    char temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
            	}
        		answer++;
            }
        }
        if(answer == A.length())
        	answer = -1;
        
        return answer;
    }
}