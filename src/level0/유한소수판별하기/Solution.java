package level0.유한소수판별하기;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 함
        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) b /= 2;
            if (b % 5 ==0) b /= 5;
        }
        answer = (a % b == 0)? 1: 2;

        return answer;
    }
}
