class Solution {
    public int smallestIndex(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int r = nums[i]%10;
                sum+=r;
                nums[i]=nums[i]/10; 
            }
            if(sum==i){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        if(arr.isEmpty()) return -1;
        return arr.get(0);
    }
}