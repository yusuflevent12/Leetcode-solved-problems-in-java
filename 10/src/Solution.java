class Solution {
    public static boolean isMatch(String s, String p) {
        if((p.charAt(0)=='.'&&p.charAt(1)=='*')||p.contains(".*")){
            return true;
        }
        String new_s="";
        String previus=null;
        String []list=p.split("");
        for(int i=0;i<list.length;i++){
            if(list[i].equals("*")){
                if(i!=0)new_s+=previus;
            }else if(list[i].equals(".")){
                    previus=list[i];
                    new_s+=previus;
            }else{
                previus=list[i];
                new_s+=previus;
            }

        }
        System.out.println(new_s);
        boolean result=true;
        if(s.length()>new_s.length())return false;
        if(new_s.contains(s))return true;

        for(int i=0;i<Math.min(s.length(),new_s.length());i++){
            if(s.charAt(i)!=new_s.charAt(i)&&(new_s.charAt(i)!='.')){
                result= false;
                break;
            }
        }
        System.out.println(result);
        return result;

    }
    public static void main(String[] args){
        isMatch("aa","a*");
    }
}