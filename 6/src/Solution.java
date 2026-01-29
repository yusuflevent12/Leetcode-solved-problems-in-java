class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0){
            return "";
        }else if(numRows==1||s.length()<3){
            return s;
        }

        int midNumber=numRows-2;//zikzaktaki çizgideki sayiların sayısını
        int max=2*(numRows-1);
        int [] midIndexes=new int[midNumber];
        midIndexes[0]=max;
        int temp=max;
        String new_s="";
        for(int i=1;i<midNumber;i++){
            temp-=2;
            midIndexes[i]=temp;
        }
        for(int i=0;i<numRows;i++){
            if(i==0||i==numRows-1){
                int index=i;
                while(index<s.length()){
                    new_s+=s.charAt(index);//ilk satir veya son satır ekleniyor
                    index+=max;
                }
            }else{
                for(int j=1;j<midIndexes.length;j++){
                    int first=midIndexes[j];
                    int second=midIndexes[midIndexes.length-j];
                    int index=0;
                    while (index<s.length()){
                        if(second==first){
                            index+=first;
                            if(index<midIndexes.length) {
                                new_s += s.charAt(index);
                                continue;
                            }
                        }
                        index+=first;
                        if(index<midIndexes.length) {
                            new_s += s.charAt(index);
                        }
                        if(index<midIndexes.length) {
                            new_s += s.charAt(second);
                        }

                    }
                }

            }

        }
        return new_s;

    }
}