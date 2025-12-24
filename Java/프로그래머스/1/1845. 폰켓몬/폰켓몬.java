import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int size = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        return Math.min(size, nums.length / 2);
    }
}