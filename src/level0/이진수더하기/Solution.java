package level0.이진수더하기;

public class Solution {
    public String solution(String bin1, String bin2) {
        //2진수 덧셈 -> 2진수를 10진수로 변환하여 덧셈. 다시 2진수로 치환
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }
}
