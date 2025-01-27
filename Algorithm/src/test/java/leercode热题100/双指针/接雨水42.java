package leercode热题100.双指针;

/**
 * 找到一个>0 找到另一个>=左边
 */
public class 接雨水42 {
    public static void main(String[] args) {
        接雨水42 ob = new 接雨水42();
        int trap = ob.trap1(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(trap);

    }

    // 第一种 暴力  找每个位置的左右最大值  就可以算出这个位置可以存多少水
    // O(n2)
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int lmax = 0;
            int rmax = 0;
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, height[j]);
            }
            for (int k = i + 1; k < height.length; k++) {
                rmax = Math.max(rmax, height[k]);
            }
            if (lmax <= height[i] || rmax <= height[i]) {
                continue;
            }
            sum += (Math.min(lmax, rmax) - height[i]);
        }
        return sum;
    }


    // 动态规划  两个数组存储每个位置的左边和右边最大值
    // O(n)
    public int trap1(int[] height) {
        int sum = 0;
        int[] lnums = new int[height.length];
        int[] rnums = new int[height.length];
        int lmax = height[0];
        int rmax = height[height.length - 1];
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i - 1] > lmax) {
                lnums[i] = height[i - 1];
                lmax = height[i - 1];
            } else {
                lnums[i] = lmax;
            }
        }

        for (int i = height.length - 2; i > 0; i--) {
            if (height[i + 1] > rmax) {
                rnums[i] = height[i + 1];
                rmax = height[i +1];
            } else {
                rnums[i] = rmax;
            }
        }

        for (int i = 1; i < height.length - 1; i++) {
            if (lnums[i] <= height[i] || rnums[i] <= height[i]) {
                continue;
            }
            sum += Math.min(lnums[i], rnums[i])-height[i];
        }
        return sum;
    }
}
