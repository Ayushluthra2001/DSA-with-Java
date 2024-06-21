class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            int k     = j+1;
            int count = 1;
            while(k < nums.length && nums[k] == nums[j]) {
                count++;
                k++;
            }
            
                 nums[i++] = nums[j];
                 j = k;
           
        }
        return i;
    }
}
