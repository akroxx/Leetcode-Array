// Question: Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        boolean zero=false,previousOne=false; // To check for first zero flipped?
        int maxone=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                if(previousOne){
                    maxone++;
                }
                else if(i==0){
                    maxone++;
                }
            }
            else if(nums[i]==0||(i==0)){
                if((!zero)){
                    maxone++;
                }
                else{
                    zero=true;
                }
            }
        }
        return ++maxone;
    }
}