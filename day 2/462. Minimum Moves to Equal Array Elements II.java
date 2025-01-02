class Solution {
    public int minMoves2(int[] nums) {
        int avg = 0;
        int ans = 0;
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            avg = (nums[nums.length/2-1] + nums[nums.length/2])/2 ;
        } else {
            avg = nums[(((nums.length + 1 ) / 2 )-1 )]  ;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < avg) {
                ans += avg - nums[i];
            } else {
                ans += nums[i] - avg;
            }
        }
        //
        return ans;
    }
}