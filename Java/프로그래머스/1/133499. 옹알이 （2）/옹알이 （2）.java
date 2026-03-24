class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for(String b : babbling) {
            for(String s : str) {
                if(b.contains(s + s)) break;
                b = b.replaceAll(s, " ");
                
            }
            if(b.trim().equals("")) answer++;
        }
        return answer;
    }
}