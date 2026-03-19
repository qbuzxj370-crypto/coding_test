import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 정렬
        Arrays.sort(phone_book);

        // 2. 인접한 문자열만 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
