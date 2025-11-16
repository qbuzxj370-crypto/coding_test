class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        for(int i = 1; i < array.length; i++) {
            idx = array[i] > array[idx] ? i : idx;
        }
        int[] answer = {array[idx], idx};
        return answer;
    }
}