class Solution {
    public int reverse(int x) {
        long number=x;
        long mod=0;
        long result=0;
        boolean isneg=false;
        if(x<0){
            isneg=true;
            number=-number;
        }

        while (true){
            if(number<10){
                result+=number;
                break;
            }
            mod=number%10;
            number/=10;
            result+=mod;
            result =result*10;

        }
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
            return 0;
        }
        if(isneg){
            return(int) -result;
        }
        return (int)result;
    }
}