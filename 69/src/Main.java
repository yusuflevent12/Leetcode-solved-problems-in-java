class Solution {
    public int mySqrt(int x) {
        double rand=2;
        double error= 0.0001;
        while (true){
            double result=x/rand;
            rand=(result+rand)/2;
            double n=Math.abs(x-rand*rand);
            if(n<error){
                break;
            }
        }
        int last= Math.toIntExact(Math.round(rand));
        return last;
    }
}