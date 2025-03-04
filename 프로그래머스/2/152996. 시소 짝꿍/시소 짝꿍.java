import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] weights = {100, 180, 360, 100, 270};
        System.out.println(sol.solution(weights));
    }

    public long solution(int[] weights) {
        Map<Double, Integer> map = new HashMap<>();
        Arrays.sort(weights);
        long answer = 0;
        for (int weight : weights) {
            double a = weight*1.0;
            double b = (weight*2.0)/3.0;
            double c = (weight*1.0)/2.0;
            double d = (weight*3.0)/4.0;
            if(map.containsKey(a)) answer += map.get(a);
            if(map.containsKey(b)) answer += map.get(b);
            if(map.containsKey(c)) answer += map.get(c);
            if(map.containsKey(d)) answer += map.get(d);
            map.put((double) (weight), map.getOrDefault((double)weight, 0) + 1);
        }

        return answer;
    }

}