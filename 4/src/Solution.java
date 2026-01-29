class Solution{
    public  double findMedianSortedArrays(int[ ] nums1,int[] nums2){

        int [] nums3=new int[nums1.length+nums2.length];
        int index1=0;
        int index2=0;
        int index3=0;
        int c=0;
        if(nums2.length!=0) {
            while (index3 < nums3.length) {
                if (nums1.length != 0) {
                    if (nums1[index1] < nums2[index2] && c != 1) {
                        nums3[index3] = nums1[index1];
                        if (index1 + 1 == nums1.length) {
                            c++;
                        }
                        if (index1 < nums1.length - 1) {
                            index1++;
                        }
                    }
                } else {
                    nums3[index3] = nums2[index2];
                    if (index2 < nums2.length - 1) {
                        index2++;
                    }

                    index3++;
                }
            }
        }else{
            nums3=nums1;
        }

        if(nums3.length%2==0){
            int index=nums3.length/2;
            int num1=nums3[index];

            int num2=nums3[index-1];
            return (double) (num2 + num1) /2;
        }else{
            return nums3[(nums3.length+1)/2];
        }

    }


}