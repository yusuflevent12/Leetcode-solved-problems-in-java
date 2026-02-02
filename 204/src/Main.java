class Solution {
    public int countPrimes(int n) {
        if(n==0){
            return 0;
        } else if (n==1) {
            return 0;
        }else if(n==2){
            return 0;
        }
        int count=1;
        int asal=3;
        boolean is=false;
        while(asal<n){
            is=false;
            for(int i=2;i<asal;i++){
                if(asal%i==0){
                     is=true;
                    break;
                }
            }
            if(!is)count++;
            asal++;
        }
        return count;
    }
}