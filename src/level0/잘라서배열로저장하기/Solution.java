package level0.잘라서배열로저장하기;

import java.util.ArrayList;

public class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n){
            String str = my_str.substring(i, Math.min(i+n,my_str.length()));
            System.out.println(str);
            answer.add(str);
        }
        return answer.stream().toArray(String[]::new);
    }
}