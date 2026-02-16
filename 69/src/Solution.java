class Solution {
    public   int mySqrt(int x) {
        int number;
        long pow1=0;
        long pow2;

        for(number=0;pow1<=x;number++){
            pow1= (long) number *number;
        }
        pow2= (long) (number + 1) *(number+1);

        if((pow2-x)<(x-pow1)){
            return number-1;
        }
        return number-2;
    }


}
