class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            // Skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }

            // Skip non-alphanumeric from right
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}
