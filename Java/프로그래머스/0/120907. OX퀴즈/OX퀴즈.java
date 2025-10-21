class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String expression[] = quiz[i].split(" ");
            int a = Integer.parseInt(expression[0]), b = Integer.parseInt(expression[2]), r = Integer.parseInt(expression[4]);
            int result = expression[1].equals("+") ?  a + b : a - b;
            answer[i] = result == r ? "O" : "X";
        }
        return answer;
    }
}