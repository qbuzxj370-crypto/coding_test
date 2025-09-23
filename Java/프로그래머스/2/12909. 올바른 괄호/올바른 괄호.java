class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')') 
            return false;
        int cnt = 1;
        for(int i = 1; i < s.length(); i++) {
            cnt += s.charAt(i) == '(' ? 1 : -1;
            if (cnt < 0)
                return false;
        }
        return cnt == 0;
    }
}