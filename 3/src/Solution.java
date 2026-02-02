import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s==null){
            return 0;
        } else if (s.equals(" ")) {
            return 1;
        }else if(s.length()==1){
            return 1;
        }
        String []list=s.split("");
        ArrayList<String> prefix=new ArrayList<>();
        int max=0;
        for(int i=0;i<list.length;i++){
            for(int j=i;j<list.length;j++){
                if(prefix.contains(list[j])){
                    if(max<prefix.size()){
                        max=prefix.size();
                    }
                    prefix.clear();
                   break;

                }else {
                    prefix.add(list[j]);
                }
            }
        }
        return  max;
    }
}