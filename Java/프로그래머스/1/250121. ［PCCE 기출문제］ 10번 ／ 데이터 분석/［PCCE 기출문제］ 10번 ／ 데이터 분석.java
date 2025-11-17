import java.util.*;

class Solution {
    public ArrayList<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        final int extIdx = outIdx(ext), sortIdx = outIdx(sort_by);
        for(int[] n : data) {
            if(n[extIdx] < val_ext) list.add(n);
        }
        list.sort((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));
        return list;
    }
    public int outIdx(String criterion) {
        int idx = 0;
        String[] str = {"code", "date", "maximum", "remain"};
        for(int i = 0; i < str.length; i++) {
            if(criterion.equals(str[i])) idx = i;
        }
        return idx;
    }
}