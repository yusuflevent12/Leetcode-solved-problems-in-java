class Solution {
    public int rob(int[] nums) {
        int num1=0,num2=0;
        for(int i=0;i<nums.length;i+=2){
            if(i<nums.length){
                num1+=nums[i];
            }
        }
        for(int i=1;i<nums.length;i+=2){
            if(i<nums.length){
                num2+=nums[i];
            }
        }

        return Math.max(num1,num2);
    }
}