package arrays;
import java.util.*;
public class trapped_water_solution {
    static int trap(int[] height){
        int n = height.length;
        // calculate left max boundary
        int leftMax[]= new int[n];
        leftMax[0]= height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);

        }
        // calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        // loop to find the trapped water
        for(int i=0; i<n; i++){
            // find the water level, water level = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // find the trapped water, trapper water = water level - height of the bar(current bar)
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,6,3,2,5};
        System.out.print("Trapped Water: "+trap(arr));
    }
}
