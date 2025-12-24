import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String c : s.split("")) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
                continue;
            }
            map.put(c, 1);
        }
        map.entrySet().removeIf(entry -> entry.getValue() > 1);

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        for (String key : keys) {
            answer += key;
        }
        
        return answer;
    }
}

/*
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)   // 중복 없는 문자만
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.joining());
    }
}
*/