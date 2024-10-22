package level0.가장큰수찾기;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = array[0]; // 최대값 저장
        int index = 0; // 최대값의 index 저장

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        answer.add(max); //max값 추가
        answer.add(index); //인덱스 추가
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
