class Solution {
    public int maxArea(int[] height) {
        int maxi=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int width=j-i;
                int length= height[i]>=height[j] ? height[j]:height[i];
                int curr=length*width;
                 if(curr>maxi) maxi=curr;
            }
        }
        return maxi;
    }
}
