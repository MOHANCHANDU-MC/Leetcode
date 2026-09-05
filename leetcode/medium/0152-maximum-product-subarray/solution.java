class Solution {
    public int maxProduct(int[] nums) {
       int maxProduct =Integer.MIN_VALUE;
       int currentProduct = 1;

       for(int i=0;i<nums.length;i++){
        currentProduct = currentProduct*nums[i];
        if(currentProduct<=0){
            currentProduct = 0;
        }
        maxProduct = Math.max(currentProduct , maxProduct);
       } 
       return maxProduct;
    }
}