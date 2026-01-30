
class Solution {
    public int romanToInt(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int I=1;
        int V=5;
        int X=10;
        int L=50;
        int C=100;
        int D=500;
        int M=1000;
        int number=0;

        String [] signs=s.split("");
        for(int i=0;i<signs.length;i++){
            if(signs[i].equalsIgnoreCase("I")){
                if(i+1!=signs.length) {
                    if (signs[i + 1].equalsIgnoreCase("v") || signs[i + 1].equalsIgnoreCase("X")) {
                        number -= I;
                    }else {
                        number+=I;
                    }
                }else if(i+1==signs.length){
                    number+=I;
                }
            } else if (signs[i].equalsIgnoreCase("v")) {
                number+=V;
            } else if (signs[i].equalsIgnoreCase("x")) {
                if(i+1!=signs.length) {
                    if (signs[i + 1].equalsIgnoreCase("L") || signs[i + 1].equalsIgnoreCase("C")) {
                        number -= X;
                    }else{
                        number+=X;
                    }
                }else if(i+1== signs.length){
                    number+=X;
                }
            } else if (signs[i].equalsIgnoreCase("l")) {
                number+=L;
            } else if (signs[i].equalsIgnoreCase("c")) {
                if(i+1!=signs.length) {
                    if (signs[i + 1].equalsIgnoreCase("D") || signs[i + 1].equalsIgnoreCase("M")) {
                        number -= C;
                    }else{
                        number+=C;
                    }
                }else if(i+1== signs.length){
                    number+=C;
                }
            } else if (signs[i].equalsIgnoreCase("d")) {
                number+=D;
            } else if (signs[i].equalsIgnoreCase("m")) {
                number+=M;
            }
        }
        return number;
    }
}