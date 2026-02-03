class Solution{
    public  double findMedianSortedArrays(int[ ] nums1,int[] nums2){
        int length=nums1.length+nums2.length;
        if(length==0){
            return 0;
        }
        int [] nums=new int[length];
        int i=0;
        int j=0;
        int n=0;
        if(nums1.length!=0&&nums2.length!=0) {
            while (i < nums1.length || j < nums2.length) {
                if (i < nums1.length) {
                    if (j != nums2.length) {
                        if (nums1[i] <= nums2[j]) {
                            nums[n++] = nums1[i++];
                        }
                    } else {
                        nums[n++] = nums1[i++];
                    }
                }
                if (j < nums2.length) {
                    if (i != nums1.length) {
                        if (nums1[i] > nums2[j]) {
                            nums[n++] = nums2[j++];
                        }
                    } else {
                        nums[n++] = nums2[j++];
                    }
                }
            }
        } else if (nums1.length==0) {
            nums=nums2;
        }else{
            nums=nums1;
        }

        if(nums.length%2==0){
            int num1=nums[nums.length/2];
            int num2=nums[(nums.length/2)-1];
            return (double) (num2 + num1) /2;
        }
        return nums[(nums.length-1)/2];

    }


}


