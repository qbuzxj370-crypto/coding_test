import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger ab = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        String answer = ab.add(bb) + "";
        return answer;
    }
}