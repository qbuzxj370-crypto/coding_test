class Solution {
    static int count = 0;
    static char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    static boolean flag = false;
    
    public int solution(String word) {
        dic(word, "");
        return count;
    }
    
    public void dic(String target, String current) {
        if(flag) return;
        if(current.length() > 0) count++;
        if(current.equals(target)) {
            flag = true;
            return;
        }
        if(current.length() == 5) return;
        else {
            for(char v : vowels) {
                dic(target, current+v);
            }
        } 
    }
}