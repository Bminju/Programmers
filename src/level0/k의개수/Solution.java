package level0.k의개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k_str = String.valueOf(k);

        for(int x = i; x <= j; x++){
            String x_str = String.valueOf(x);
            for(int y = 0; y < x_str.length(); y++){
                if(x_str.charAt(y) == k_str.charAt(0)){
                    answer++;
                }
            }
        }

        return answer;
    }
}
