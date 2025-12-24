class Solution {
    public int solution(int n) {
        int answer = 0; 
        int dec = 0;

        while (dec < n) {
            answer++;
            // answer가 3의 배수가 아니거나 3을 포함하지 않은 수일때만 dec(10진수 값)을 증가
            // 조건을 만족하지 않으면 10진수 숫자는 변경되지 않으며 마을식 숫자만 증가하여 조건에 맞을때까지 answer만 증가
            if (answer % 3 != 0 && !Integer.toString(answer).contains("3")) {
                dec++;
            }
        }

        return answer;
    }
}
