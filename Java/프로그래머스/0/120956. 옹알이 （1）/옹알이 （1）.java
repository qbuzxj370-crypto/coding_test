class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        String con = "";
        for(String b : babbling) {
            con = b.replaceAll(".", "*");
            for(String s : str) {
                b = b.replace(s, s.replaceAll(".", "*"));
                if(b.equals(con)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}