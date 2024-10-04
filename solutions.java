
// Problem #3: Container with most Water (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity: O(N)
// Space Complexity: O(1)
// Algorithm: 2 pointer approach --> caluclate max at each step --> move the pointer with lower height --> return height when pointers cross each other
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int low = 0, high = n-1, max = 0;

        while(low < high){
            int func_height = Math.min(height[low], height[high]);
            int area = (high - low) * func_height;
            max = Math.max(area, max);

            if (height[low] > height[high]){
                high--;
            }
            else{
                low++;
            }
        }
        return max;
    }
}

