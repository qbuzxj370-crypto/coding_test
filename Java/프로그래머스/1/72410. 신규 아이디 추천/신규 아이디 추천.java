class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        String answer = "";
        for(char c : new_id.toCharArray()) {
            if(('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '-' || c == '_' || c == '.') {
                answer += c;
            }
        }
        answer = answer.replaceAll("[.]+", ".");
        StringBuilder sb = new StringBuilder(answer);
        if(sb.charAt(0) == '.') sb.deleteCharAt(0);
        if(sb.length() == 0) sb.append("a");
        if(sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1);
        if(sb.length() >= 16) {
            sb.delete(15, sb.length());
            if(sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1);
        }
        if(sb.length() <= 2) {
            while(sb.length() < 3) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }
        return sb.toString();
        /*
        String id = new_id.toLowerCase()
                // 2단계: 허용된 문자만 남기기
                .replaceAll("[^a-z0-9-_.]", "")
                // 3단계: 연속된 마침표 하나로 줄이기
                .replaceAll("[.]{2,}", ".")
                // 4단계: 처음과 끝의 마침표 제거
                .replaceAll("^[.]|[.]$", "");

        // 5단계: 빈 문자열 처리
        if (id.isEmpty()) id = "a";

        // 6단계: 길이가 16 이상이면 앞 15자만 남김
        if (id.length() >= 16) {
            id = id.substring(0, 15).replaceAll("[.]$", "");
        }

        // 7단계: 길이가 2 이하라면 마지막 문자를 반복해서 붙임
        while (id.length() < 3) {
            id += id.charAt(id.length() - 1);
        }

        return id;
        */
    }
}