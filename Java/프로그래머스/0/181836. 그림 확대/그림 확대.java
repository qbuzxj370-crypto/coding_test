class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0; i < picture.length; i++) {
            String enla = "";
            for(int j = 0; j < picture[0].length(); j++) {
                char p = picture[i].charAt(j);
                for(int t = 0; t < k; t++) {
                    enla += p;
                }
                for(int t = 0; t < k; t++) {
                    answer[i * k + t] = enla;
                }
            }
        }
        return answer;
    }
}