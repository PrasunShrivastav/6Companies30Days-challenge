class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearx = Math.max(x1,Math.min(xCenter,x2));
        int neary = Math.max(y1,Math.min(yCenter,y2));
        int y = yCenter - neary ; 
        int x = xCenter - nearx ; 
        int ans = (x*x) + (y*y);
        if(ans<=(radius * radius)){
            return true ; 

        }
        return false ;

    }
}