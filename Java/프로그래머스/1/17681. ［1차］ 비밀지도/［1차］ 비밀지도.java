class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            answer[i] = "";
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            
            while(binary1.length() < n) {
                binary1 = "0" + binary1;
            }
            
            while(binary2.length() < n) {
                binary2 = "0" + binary2;
            }
            
            for(int j = 0; j < n; j++) {
                answer[i] += (binary1.charAt(j) == binary2.charAt(j) && binary1.charAt(j) == '0')
                    ? " " : "#";
            }
        }
        return answer;
    }
}