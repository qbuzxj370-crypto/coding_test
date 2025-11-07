class Solution {
    public int solution(int[] num_list) {
        int sumO = 0, sumE = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) sumE += num_list[i];
            else sumO += num_list[i];
        }
        return sumO > sumE ? sumO : sumE;
    }
}