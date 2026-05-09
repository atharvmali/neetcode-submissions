class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!hm.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}