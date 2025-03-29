package level0.옹알이1;

public class Solution {

    public int solution(String[] babbling) {
        int answer = 0;

        for (String word : babbling) {
            // 같은 단어 연속 불가
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }

            word = word.replaceAll("aya|ye|woo|ma", "");

            if (word.isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}
