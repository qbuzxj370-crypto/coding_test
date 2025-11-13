class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Math.abs(array[0] - n);
        for(int i = 1; i < array.length; i++) {
            int tmp = Math.abs(array[i] - n);
            if(min > tmp) {
                answer = i;
                min = tmp;
            }
            else if(min == tmp) {
                answer = array[answer] <= array[i] ? answer : i;
            }
        }
        return array[answer];
    }
}