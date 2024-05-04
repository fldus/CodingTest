class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for(int i=0; i< before.length(); i++){
            String s = String.valueOf(before.charAt(i));
        	after = after.replaceFirst(s, "");
        }
        answer = after.equals("")? 1:0;
        return answer;
    }
}