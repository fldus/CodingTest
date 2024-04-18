class Solution {
    public int[] solution(int[] numbers, String direction) {
        int temp;
        if(direction.equals("left")){
            for(int i=0; i<numbers.length-1; i++){
                temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }else
            for(int j = numbers.length-1; j>0; j--){
                temp = numbers[j];
                numbers[j] = numbers[j-1];
                numbers[j-1] = temp;
            }
        
        return numbers;
    }
}