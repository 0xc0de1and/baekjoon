import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
    }

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        return Math.min(set.size(), nums.length / 2);
    }
}
