/// ================================
class Solution {
    public  static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        } else if (x==0) {
            return true;
        }
        int new_x=x;
        int number=0;
        while(true){
            if(new_x<10){
                number+=new_x;
                break;
            }
            int mode=new_x%10;
            new_x=new_x/10;
            number+=mode;
            number*=10;
        }
        if(number==x){
            return true;
        }
        return  false;
    }

}