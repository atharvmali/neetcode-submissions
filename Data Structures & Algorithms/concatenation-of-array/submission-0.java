class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int newArr[] = new int[2*n];
        for(int i = 0; i < n; i++) {
            newArr[i] = nums[i];
        }
        // System.out.println(newArr.length);
        for(int i = n, j = 0; i < newArr.length; i++, j++) {
            newArr[i] = nums[j];
        }
        return newArr;
    }
}