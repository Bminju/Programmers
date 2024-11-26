package level0.제곱수판별하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n) { //제곱수 확인
            answer = 1;
        } else {answer = 2;}

        return answer;
    }
}

/** 다른 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n % Math.sqrt(n) == 0) { //나머지로 제곱수 확인
            answer = 1;
        } else {answer = 2;}

        return answer;
    }
}
 **/