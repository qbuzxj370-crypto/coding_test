import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        /*
        재배열 부등식(Rearrangement Inequality):
        - 두 수열을 같은 방향(둘 다 오름차순 or 내림차순)으로 정렬하면 곱의 합이 최대
        - 반대 방향(한쪽 오름차순, 다른 쪽 내림차순)으로 정렬하면 곱의 합이 최소
        */
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length;
        
        int answer = 0;
        for (int i = 0; i < len; i++) {
            answer += A[i] * B[len - 1 - i];
        }
        return answer;
    }
}