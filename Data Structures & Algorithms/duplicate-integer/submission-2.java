class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(Arrays.stream(nums).distinct().count() == nums.length)
        return false;
        else return true;
    }
}