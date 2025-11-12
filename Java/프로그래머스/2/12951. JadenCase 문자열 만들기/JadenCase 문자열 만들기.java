class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                isFirst = true;
            } else {
                if (isFirst) {
                    sb.append(Character.isLetter(c) ? Character.toUpperCase(c) : c);
                    isFirst = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
