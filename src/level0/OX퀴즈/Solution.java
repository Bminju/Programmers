package level0.OX퀴즈;

import java.util.ArrayList;

public class Solution {
    public String[] solution(String[] quiz) {

        ArrayList<String> answer = new ArrayList<>();
        //quiz 배열 읽기 -> string " "기준으로 split -> 인덱스 0 2 4: 숫자, 1: 연산자 -> 삼항연산자 사용
        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");

            String result = "";
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int num3 = Integer.parseInt(str[4]);

            if(str[1].equals("-")){
                result = (num1 - num2 == num3) ? "O" : "X" ;
            }else { result = (num1 + num2 == num3) ? "O" : "X" ; }
            answer.add(result);
        }
        return answer.stream().toArray(String[]::new); //String 배열 리턴
    }
}
