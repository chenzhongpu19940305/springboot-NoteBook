package leercode热题100.双指针;


/**
 * 要解决“盛最多水的容器”问题，可以使用双指针的方法。具体思路如下：
 * <p>
 * 问题分析：
 * <p>
 * 容器的水量由两个因素决定：宽度（两条垂线之间的距离）和高度（两条垂线中较短的那条）。
 * <p>
 * 水量公式为：水量 = 宽度 * 高度 = (right - left) * min(height[left], height[right])。
 * <p>
 * 双指针方法：
 * <p>
 * 初始化两个指针 left 和 right，分别指向数组的开头和结尾。
 * <p>
 * 计算当前水量，并更新最大水量。
 * <p>
 * 移动较短的那条垂线的指针（因为水量受限于较短的那条垂线，移动较短的指针有可能找到更高的垂线，从而增加水量）。 //这一步是核心
 * <p>
 * 重复上述步骤，直到 left 和 right 相遇。
 */
public class 盛水最多的容器11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int water = (r - l) * Math.min(height[r], height[l]);
            max = Math.max(max, water);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
