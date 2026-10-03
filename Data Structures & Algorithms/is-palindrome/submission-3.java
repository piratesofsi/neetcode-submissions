class Solution {
    private boolean isPalindrome(StringBuilder sb) {
        int start = 0;
        int end = sb.length() - 1;

        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return isPalindrome(sb);
    }
}
