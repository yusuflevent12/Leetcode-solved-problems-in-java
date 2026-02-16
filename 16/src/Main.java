class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest_index=0;
        int min_difference=10000;
        boolean isneg=false;
        for(int i=0;i<nums.length;i++){
                if (Math.abs(target - nums[i]) < min_difference) {
                    min_difference = target - nums[i];
                    if (min_difference < 0) {
                        isneg = true;
                        min_difference = -min_difference;
                    }
                    closest_index = i;
                }

        }
        int second_index=0;
        int third_index=0;
        int min=1000;
        for(int i=0;i<nums[i];i++){
            for(int j=0;j<nums[j];j++){
                if(isneg) {
                    if (Math.abs(nums[i] - min_difference - nums[j]) < min) {
                        if (i != j && i != closest_index && j != closest_index) {
                            third_index = j;
                            second_index = i;
                            min = Math.abs(nums[i] + min_difference - nums[j]);
                        }
                    }
                }else{
                    if (Math.abs(nums[i] + min_difference - nums[j]) < min) {
                        if (i != j && i != closest_index && j != closest_index) {
                            third_index = j;
                            second_index = i;
                            min = Math.abs(nums[i] + min_difference - nums[j]);
                        }
                    }
                }
            }
        }

        return nums[second_index]+nums[third_index]+nums[closest_index];
    }
}