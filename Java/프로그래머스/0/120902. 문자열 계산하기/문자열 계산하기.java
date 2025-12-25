class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i = 2; i < str.length; i+=2) {
            int n = Integer.parseInt(str[i]);
            answer += str[i - 1].equals("+") ? n : (n * -1);
        }
        return answer;
    }
}