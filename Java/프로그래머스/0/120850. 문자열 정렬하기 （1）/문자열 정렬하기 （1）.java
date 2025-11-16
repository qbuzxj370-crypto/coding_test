import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        for(char c : my_string.toCharArray()) {
            if('0' <= c && c <= '9') list.add(Character.getNumericValue(c));
        }
        Collections.sort(list);
        return list;
    }
}