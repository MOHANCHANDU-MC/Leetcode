class Solution {
    public int trap(int[] height) {
       int i=0;
       int j=height.length-1;
       int lmax=0;
       int rmax=0;
       int res=0;
       while(i<j){
        if(height[i]<height[j]){
            lmax=Math.max(lmax , height[i]);
            res+=lmax-height[i++];
        }
        else{
            rmax=Math.max(rmax , height[j]);
            res+=rmax-height[j--];
        }
       }
       return res;
    }
}