package level0.다음에올숫자;

public class Solution {
    public int solution(int[] common) {
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];

        // 등차수열인 경우
        if(diff1 == diff2) {
            return common[common.length - 1] + diff1;
        } else {
            int ratio = common[1] / common[0];
            return common[common.length - 1] * ratio;
        }
    }
}
