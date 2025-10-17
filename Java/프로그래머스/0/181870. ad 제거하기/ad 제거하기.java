import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(String str : strArr) {
            if(!str.contains("ad")) {
                list.add(str);
            }
        }
        return list;
    }
}