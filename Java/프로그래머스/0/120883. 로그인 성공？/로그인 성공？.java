class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] d : db) {
            if(id_pw[0].equals(d[0])) {
                return id_pw[1].equals(d[1]) ? "login" : "wrong pw";
            }
        }
        return answer;
    }
}