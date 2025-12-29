class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = slicer[0], end = slicer[1], plus = 1, len = 1;
        switch (n) {
            case 1:
                start = 0;
                break;
            case 2: 
                end = num_list.length - 1;
                break;
            case 3: 
                break;
            case 4: 
                plus = slicer[2];
                break;
        }
        len = (end - start) / plus + 1;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = num_list[start + i*plus];
        }
        return answer;
    }
}