class Solution {
    public int searchInsert(int[] nums, int target) {
       int low=0;
       int high=nums.length-1;
       int mid=0;
       int pos=0;
       while(low<=high){
            mid=(high+low)/2;
            if(target==nums[mid]){
                pos=mid;
                return pos;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
                pos=low;
            }
        }
        return pos;
    }
}