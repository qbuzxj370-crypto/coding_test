class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int g = gcd(Math.max(n, m), Math.min(n, m));
        return new int[]{g, n / g * m};
    }
    public int gcd (int max, int min) {
        while(min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        return max;
    }
        /*
        [Euclidean Algorithm 증명 요약]
        
        정의: b>0인 정수 a,b에 대해 나눗셈 정리로 a = bq + r (0 <= r < b)인 정수 q,r가 존재하며 r = a % b 이다.
        
        핵심 불변식: gcd(a,b) = gcd(b,r).
        - 어떤 양의 정수 d에 대해 a/d와 b/d가 정수이면 (a - bq)/d = r/d도 정수이므로 d는 b와 r도 나누어떨어지게 한다.
        - 반대로 b/d와 r/d가 정수이면 (bq + r)/d = a/d도 정수이므로 d는 a와 b도 나누어떨어지게 한다.
        따라서 (a,b)의 공약수 집합과 (b,r)의 공약수 집합이 같아 최대공약수도 같다.
        
        종료: (a,b) -> (b, a%b)로 바꾸면 새 나머지 r은 0 <= r < b 이므로 두 번째 값이 계속 감소한다.
        따라서 어떤 단계에서 나머지가 0이 되어 (x,0)에 도달하며 종료한다.
        
        정답: gcd(x,0) = x 이므로, 나머지가 0이 되었을 때의 마지막 0이 아닌 값이 gcd(a,b)이다.
        */
        

}