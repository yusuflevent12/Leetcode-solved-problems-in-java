class Solution {
    public  String longestPalindrome(String s) {
        String palindrome="";
        int temp_max=1;
        int sol=1;
        int sağ=1;
        int max=1;
        int temp_sol=1;
        int temp_sağ=1;
        int index=0;
        String [] list=s.split("");
        for(int i=0;i<list.length;i++){
            while (i-temp_sol>=0&&i+temp_sağ<list.length){
                if(list[i-temp_sol].equals(list[i+temp_sağ])){
                    temp_sağ++;
                    temp_sol++;
                    temp_max+=2;
                }else{
                    break;
                }
            }
            while(i-temp_sol>=0||i+temp_sağ<list.length){
                int c=0;
                if(i-temp_sol>=0){
                    if(list[i-temp_sol].equals(list[i])){
                        temp_sol++;
                        temp_max++;

                    }else{
                        c++;
                    }
                }
                if(i+temp_sağ<list.length){
                    if(list[i+temp_sağ].equals(list[i])){
                        temp_sağ++;
                        temp_max++;
                    }else {
                        c++;
                    }
                }
                if(c==2){
                    break;
                }

            }
            if(temp_max>max){
                max=temp_max;
                sol=temp_sol;
                sağ=temp_sağ;
                index=i;
                temp_sol=1;
                temp_sağ=1;
                temp_max=1;
            }



        }
        for(int i=index-sol+1;i<index+sağ;i++){
            palindrome+=list[i];
        }

        return palindrome.toString();
    }



}