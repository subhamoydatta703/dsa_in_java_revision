package arrays;

public class container_most_water {
    // container with most water problem(leetcode 11)
    // brute force approach
    static int maxArea(int[] height) {
        int maxWater = 0, n = height.length;
        for (int left = 0; left < n; left++) {
            for (int right = left + 1; right < n; right++) {
                int w = right - left;
                int ht = Math.min(height[left], height[right]);
                int area = w * ht;
                maxWater = Math.max(area, maxWater);
            }
        }
        return maxWater;
    }

    // optimal approach(using 2 pointers)
    static int optimizedMaxArea(int[] height) {
        int l = 0, r = height.length - 1, maxWater = 0;
        while (l < r) {
            int w = r - l;
            int ht = Math.min(height[l], height[r]);
            int area = w * ht;
            maxWater = Math.max(area, maxWater);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.print(optimizedMaxArea(height));
    }
}
