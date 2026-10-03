class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        ArrayDeque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (ch == '[') {
                st.push(']');
            }

            else if (ch == ')' && !st.isEmpty() && st.peek() == ')') {
                st.pop();
            } else if (ch == '}' && !st.isEmpty() && st.peek() == '}') {
                st.pop();
            } else if (ch == ']' && !st.isEmpty() && st.peek() == ']') {
                st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty();
    }
}
