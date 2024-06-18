class Solution {
    public void moveZeroes(int[] nums) {
       List<Integer>ans=new ArrayList<Integer>();
        int countZero=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) ans.add(nums[i]);
            else countZero++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<ans.size()){
              int x=ans.get(i);
              nums[i]=x;
               
            }else nums[i]=0;
        }
    }
}
