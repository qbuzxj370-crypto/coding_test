import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. 정렬 (그리디의 전제 조건)
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 2. 전처리: 여벌이 있는데 도난당한 학생 제외
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1; 
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        int unprepared = 0; 
        int idx = 0; // reserve 배열을 가리키는 포인터
        
        for (int l = 0; l < lost.length; l++) {
            // 이미 전처리에서 제외된 학생(자기 옷 입은 학생)은 건너뜀
            if (lost[l] == -1) continue;
            
            boolean gotCloth = false; // 이번 lost 학생이 옷을 빌렸는지 확인
            
            while (idx < reserve.length) {
                // 이미 빌려줬거나 본인이 입은 reserve 학생은 무조건 건너뜀
                if (reserve[idx] == -1) {
                    idx++;
                    continue;
                }
                
                // 케이스 1: 현재 여벌 옷 주인이 너무 번호가 낮음 -> 다음 여벌 주인 확인
                if (reserve[idx] < lost[l] - 1) {
                    idx++;
                } 
                // 케이스 2: 빌려줄 수 있는 범위(앞번호 혹은 뒷번호)에 있음
                else if (reserve[idx] <= lost[l] + 1) {
                    reserve[idx] = -1; // 빌려줌 처리
                    gotCloth = true;
                    break; // 빌렸으니 다음 lost 학생으로
                } 
                // 케이스 3: 현재 여벌 옷 주인이 너무 번호가 높음 -> 이번 lost 학생은 포기
                else {
                    break;
                }
            }
            
            // while 문을 다 돌거나 break로 나왔는데도 못 빌렸다면
            if (!gotCloth) {
                unprepared++;
            }
        }
        
        return n - unprepared;
    }
}