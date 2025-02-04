package level0.삼각형의완성조건2;

import java.util.ArrayList;

public class Solution {
    public int solution(int[] sides) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        //배열의 max값보다 작으면서 min 값과 정수의 합이 max값보다 큰 경우
        for(int i = 0; i <= max; i++){
            if(min + i > max){
                list.add(min + i);
            }
        }
        //배열의 max값보다 크면서 두 정수의 합보다 작은 경우
        for(int i = max+1; i < min+max; i++){
            list.add(i);
        }
        return list.size();
    }
}
