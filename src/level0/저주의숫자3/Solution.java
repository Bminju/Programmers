package level0.저주의숫자3;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 1;
        // 숫자에 3이 포함되어 있거나, 3의 배수
        while (list.size() < 100) {
            if(num % 3 != 0 && !String.valueOf(num).contains("3")){
                list.add(num);
            }
            num++;
        }
        return list.get(n-1);
    }
}
