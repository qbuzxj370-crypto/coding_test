class Solution {
    public String solution(String my_string, int s, int e) {
        String first = "";
        if(s > 0) first = my_string.substring(0, s);
        String center = my_string.substring(s, e + 1),end = my_string.substring(e + 1);
        String rCenter = "";
        char[] c = center.toCharArray();
        for(int i = c.length - 1; i >= 0; i--) {
            rCenter += c[i];
        }
        return first + rCenter + end;
    }
}