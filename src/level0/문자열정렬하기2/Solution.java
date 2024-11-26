package level0.문자열정렬하기2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase(); //소문자 변환
        char[] array = str.toCharArray();
        Arrays.sort(array); //알파벳 정렬
        String answer = new String(array); //문자열로 변환
        return answer;
    }
}
