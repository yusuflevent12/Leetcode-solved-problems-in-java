

class Solution {
    public static int myAtoi(String s) {
        long number=0;
        s=s.trim();
        boolean isneg=false;
        boolean iszero=false;
        boolean ispos=false;
        for(int i=0;i<s.length();i++){
            if(number/10>Integer.MAX_VALUE)break;
            System.out.println(number);
            if(ispos&&isneg){
                break;
            }else if(s.charAt(i)=='1'){
                number+=1;
                number*=10;
            } else if (s.charAt(i)=='2') {
                number+=2;
                number*=10;
            }else if (s.charAt(i)=='3') {
                number+=3;
                number*=10;
            }else if (s.charAt(i)=='4') {
                number+=4;
                number*=10;
            }else if (s.charAt(i)=='5') {
                number+=5;
                number*=10;
            }else if (s.charAt(i)=='6') {
                number+=6;
                number*=10;
            }else if (s.charAt(i)=='7') {
                number+=7;
                number*=10;
            }else if (s.charAt(i)=='8') {
                number+=8;
                number*=10;
            }else if (s.charAt(i)=='9') {
                number+=9;
                number*=10;
            }else if (s.charAt(i)=='0') {
                iszero=true;
                number*=10;
            }else if (s.charAt(i)=='-'&&number==0&&!iszero&&!isneg&&!ispos) {
                isneg=true;
            } else if (s.charAt(i)=='+'&&number==0&&!iszero&&!ispos&&!isneg) {
                ispos=true;
            } else {
                break;
            }
        }
        number/=10;
        System.out.println(number);
        if(!isneg&&!ispos)ispos=true;
        if(number> Integer.MAX_VALUE&&!isneg&&ispos){
            return Integer.MAX_VALUE;

        } else if (-number<Integer.MIN_VALUE&&isneg) {
            return Integer.MIN_VALUE;
        }
        if(isneg){
            return (int)-number;
        }
        return(int) number;
    }
    public static void main(String[] args){
        myAtoi("2000000000000000000000");
    }

}