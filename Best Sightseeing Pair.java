class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxi = 0;
        int currMaxi =0;
        currMaxi = values[0];
        for(int i =1;i<values.length;i++){
            maxi = Math.max(maxi ,currMaxi+values[i]-i);
            currMaxi = Math.max(currMaxi,i+values[i]);
        }



        return maxi;
    }
}
