package level0.연속된수의합;

public class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        //중앙값 total / num
        int start = (total / num) - (num - 1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = start +i;
        }

        return answer;
    }

}
