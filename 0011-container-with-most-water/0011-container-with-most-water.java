class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(right > left){
            int width = right - left;

            int h;
            if(height[left] < height[right]){
             h = height[left];
            }
            else{
             h = height[right];
            }
            int area =  width * h;
            if(area > maxArea){
                maxArea = area;
            }

            if(height[left] < height[right]){
                 left++;
            }
            else{
                 right--;
            }
        }
        return maxArea;
    }
}