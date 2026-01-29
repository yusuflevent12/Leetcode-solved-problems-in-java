import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String [] list=s.split("");

        int start=0;
        int end=0;
        //armutana
        int max=0;
        ArrayList<String> new_list=new ArrayList<>();
        for(int i=0;i<list.length;i++){
            if(!new_list.contains(list[i])){
                end++;
                new_list.add(list[i]);
            }else{
                if(max<end) {
                    max = end;
                }
                i--;
                new_list.clear();
                end=0;
            }
        }
        if(max<s.length()){
            return 1;
        }
        return max;
    }
}