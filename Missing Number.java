class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int startIndex=0;
        while(startIndex < nums.length){
            //System.out.println(nums[startIndex]);
            if(nums[startIndex] == startIndex) startIndex++;
            else return startIndex;
        }
        return startIndex;
    }
}
