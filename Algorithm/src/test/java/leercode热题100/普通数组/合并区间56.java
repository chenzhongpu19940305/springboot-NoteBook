package leercode热题100.普通数组;

import java.util.*;
import java.util.stream.Collectors;

public class 合并区间56 {
    public int[][] merge(int[][] intervals) {
        // 1首先按照起点排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // 存储结果
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            // 这里条件判断有东西的
            if (currentStart <= end) {
                end = Math.max(currentEnd, end);
            } else {
                result.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            }
        }

        // 处理最后一个区间
        result.add(new int[]{start, end});
        // list转2维数组 ******
        return result.toArray(new int[result.size()][]);
    }
}
