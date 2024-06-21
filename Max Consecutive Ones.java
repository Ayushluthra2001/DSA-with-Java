class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int i = 0;
       int j = 0;
       int maxCount=0;

       while(i < nums.length){
         j=i+1;
         int count=1;
         while( j< nums.length && nums[j]==nums[i]) {
            j++;
            count++;
         }
         if(maxCount <= count ) maxCount=count;
         i=j;
       } 
       return maxCount;
    }
}
