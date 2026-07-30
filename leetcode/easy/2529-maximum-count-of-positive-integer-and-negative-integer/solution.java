class Solution {
    public int maximumCount(int[] nums) {
        int posCount=lowerBound(nums,0);
        int negCount=nums.length-upperBound(nums,0);
        return Math.max(posCount,negCount);
        
    }
    public static int lowerBound(int[] nums , int target){
        int high=nums.length-1;
        int low = 0;
        int mid=0;
        int ans=nums.length;
        while(low<=high){
           mid=(high+low)/2;
           if(nums[mid]>=target){
            ans=mid;
            high=mid-1;
           }
           else {
            low=mid+1;
           }
        }
        return ans;
    }
    public static int upperBound(int[] nums , int target){
        int high=nums.length-1;
        int low = 0;
        int mid=0;
        int ans=nums.length;
        while(low<=high){
           mid=(high+low)/2;
           if(nums[mid]>target){
            ans=mid;
            high=mid-1;
           }
           else {
            low=mid+1;
           }
        }
        return ans;
    }
}