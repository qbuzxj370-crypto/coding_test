class Solution {
    public int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < str.length; i++) {
            s = s.replace(str[i], i+"");
        }
        return Integer.parseInt(s);
    }
}