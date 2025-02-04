package level0.숨어있는숫자의덧셈2;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder tmp = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                tmp.append(ch);
            } else {
                if (tmp.length() > 0) {
                    answer += Integer.parseInt(tmp.toString());
                    tmp.setLength(0); //초기화
                }
            }
        }
        //my_string의 마지막 글자가 숫자일 경우
        if (tmp.length() > 0) {
            answer += Integer.parseInt(tmp.toString());
        }
        return answer;
    }
}