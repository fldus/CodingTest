class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
        	int min = array[i];
        	int k = i;
            for(int j=i+1; j<array.length; j++){
                if(min > array[j]){
                    min = array[j];
                    k = j;
                } 
            }
            int temp = array[i];
            array[i] = min;
            array[k] = temp;
        }// 정렬
        answer = array[array.length/2];
        // 인덱스 값 = 0부터 시작.
        return answer;
    }
}