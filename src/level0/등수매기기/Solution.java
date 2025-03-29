package level0.등수매기기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] avg = new double[n];

        //평균 점수 계산 - 실수 나눗셈 주의
        for (int i = 0; i < n; i++){
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        //평균 점수 정렬
        Double[] sorted = Arrays.stream(avg)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Double[]::new);

        //등수 계산
        int[] answer = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < sorted.length; j++){
                if(avg[i] == sorted[j]){
                    answer[i] = j + 1;
                    break; //중복 등수 처리
                }
            }
        }

        return answer;
    }
}
