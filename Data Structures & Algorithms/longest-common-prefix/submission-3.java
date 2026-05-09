class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        StringBuilder s1 = new StringBuilder(strs[0]);
        StringBuilder s2 = new StringBuilder(strs[strs.length-1]);
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return ans.toString();
            }
            ans.append(s1.charAt(i));
        }

        return ans.toString();
    }
}