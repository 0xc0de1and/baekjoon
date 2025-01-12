class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
    }

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
