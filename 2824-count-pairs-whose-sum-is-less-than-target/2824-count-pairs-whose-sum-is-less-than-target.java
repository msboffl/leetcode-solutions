class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        
        int n = nums.size();
        int cnt = 0; 
        int left = 0;
        int right = nums.size()-1;
        while(left < right) {
            if(nums.get(left) + nums.get(right) < target) {
                cnt += right - left;
                left++;
            } else {
                right--;
            }
        }
        return cnt;
    }
}