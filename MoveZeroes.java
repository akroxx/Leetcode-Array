class Solution {
    public void moveZeroes(int[] nums) {
        int pPointer=0,point=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pPointer++] = nums[i]; //Copying same value
            }
        }
        while(pPointer < nums.length){
            nums[pPointer++] = 0;
        }
    }
}