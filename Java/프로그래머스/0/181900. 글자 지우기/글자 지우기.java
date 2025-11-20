class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        for(int i : indices) {
            arr[i] = "";
        }
        String answer = String.join("", arr);
        return answer;
    }
}