class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] arr = {0, 0, 0, 0};
        char[] str = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        /*
        1번 지표	(R+), (T-)
        2번 지표	(C+), (F-)
        3번 지표	(J+), (M-)
        4번 지표	(A+), (N-)
        */
        for(int i = 0; i < survey.length; i++) {
            int score = 0;
            if(choices[i] == 4) {
                continue;
            }
            else if(score > 4) {
                score = choices[i] - 7;
            }
            else {
                score = 4 - choices[i];
            }
            switch(survey[i]) {
                case "RT":
                    arr[0] += score;
                    break;
                case "TR":
                    arr[0] += score*-1;
                    break;
                case "CF":
                    arr[1] += score;
                    break;
                case "FC":
                    arr[1] += score*-1;
                    break;
                case "JM":
                    arr[2] += score;
                    break;
                case "MJ":
                    arr[2] += score*-1;
                    break;
                case "AN":
                    arr[3] += score;
                    break;
                case "NA":
                    arr[3] += score*-1;
                    break;
                
            }
        }
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                answer += str[i*2] < str[i*2 + 1] ? str[i*2] : str[i*2 + 1];
                continue;
            }
            answer += arr[i] > 0 ? str[i*2] : str[i*2 + 1];
        }
        return answer;
    }
}