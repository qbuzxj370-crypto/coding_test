import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] b = before.split("");
        String[] a = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b) ? 1 : 0;
    }
}