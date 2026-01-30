class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10], y = new int[10];
        for(char c : X.toCharArray()) x[c - '0']++;
        for(char c : Y.toCharArray()) y[c - '0']++;
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(x[i]-- > 0 && y[i]-- > 0) {
                sb.append(i);
            }
        }
        if(sb.length() == 0) return "-1";
        else if(sb.charAt(0) == '0') return "0";
        else return sb.toString();
    }
}