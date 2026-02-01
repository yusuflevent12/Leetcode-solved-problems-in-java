class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==0){
            return new int[]{1};
        }

        digits[digits.length-1]++;
        int [] new_digits=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            if(i-1>=0) {
                if (digits[i] == 10) {
                    digits[i] = 0;
                    digits[i-1]++;
                }
            }else{
                if (digits[i] == 10) {
                    digits[i]=0;
                    new_digits[i]=1;
                    for(int j=0;j<digits.length;j++){
                        new_digits[i+1]=digits[i];
                    }
                    digits=new_digits;
                }
            }

        }

        return digits;
    }
}