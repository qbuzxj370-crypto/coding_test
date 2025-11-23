class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char f = pat.charAt(0);
        int cnt = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(f == myString.charAt(i)) {
                cnt = 0;
                for(int j = 0; j < pat.length(); j++) {
                    if(j + i > myString.length() - 1) break;
                    if(pat.charAt(j) == myString.charAt(j+i)) {
                        cnt++;
                    }
                    else {
                        break;
                    }
                }
                if(cnt == pat.length()) answer++;
            }
        }
        return answer;
    }
}