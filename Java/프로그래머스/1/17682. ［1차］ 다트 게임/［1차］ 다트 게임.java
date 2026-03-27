class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        dartResult = dartResult.replace("10", "/");
        
        int[] scores = new int[3];
        int round = 0;
        String segment = "";
        
        for(char c : dartResult.toCharArray()) {
            if('/' <= c && c <= '9') {
                segment += c;
                
            } else if(c == '*' || c == '#') {
                scores[round-1] *= c == '*' ? 2 : -1;
                if(round == 1 || c == '#') continue;
                scores[round-2] *= 2;
                
            } else {
                segment += c;
                scores[round] = getScore(segment);
                
                round++;
                segment = "";
            }
        }
        
        for(int s : scores) answer += s;
        
        return answer;
    }
    
    public int getScore(String str) {
        int n = str.charAt(0) == '/' ? 10 : str.charAt(0) - '0';
        
        switch(str.charAt(1)) {
            case 'D':
                n = n*n;
                break;
            case 'T':
                n = n*n*n;
                break;                
        }
        
        return n;
    }
}