package level0.최댓값만들기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {

        Arrays.sort(numbers); //배열을 오름차순 정렬
        int n = numbers.length;

        //최댓값 후보: 가장 큰 양수 두 개의 곱 vs 가장 작은 음수 두 개의 곱
        int max1 = numbers[n - 1] * numbers[n - 2];
        int max2 = numbers[0] * numbers[1];

        return Math.max(max1, max2);
    }
}
