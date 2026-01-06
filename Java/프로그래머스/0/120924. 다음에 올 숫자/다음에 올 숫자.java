class Solution {
    public int solution(int[] common) {
        int last = common[common.length - 1];
        if(common[1] - common[0] == common[2] - common[1]) {
            return last + (common[1] - common[0]);
        } else {
            int d = common[1] / common[0];
            return last * d;
        }
    }
}