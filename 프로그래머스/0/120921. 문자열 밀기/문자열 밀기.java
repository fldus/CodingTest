class Solution {
    public int solution(String A, String B) {
        B = B.repeat(2);
        return B.indexOf(A);
    }
}