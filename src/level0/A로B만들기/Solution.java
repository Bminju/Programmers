package level0.A로B만들기;

import java.util.Arrays;

public class Solution {
    public int solution(String before, String after) {
        //문자열 -> 문자 배열
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();

        //문자 배열 정렬
        Arrays.sort(b);
        Arrays.sort(a);

        return Arrays.equals(b,a) ? 1 : 0;
    }
}
