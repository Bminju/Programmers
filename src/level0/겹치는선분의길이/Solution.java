package level0.겹치는선분의길이;

public class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[201]; //배열의 길이 200

        for(int[] arr : lines) {
            //음수 보정
            int left = arr[0] + 100;
            int right = arr[1] + 100;

            for(int i=left; i<right; i++){
                cnt[i]++;
            }
        }
        for(int i : cnt){
            if(i > 1) answer++;
        }

        return answer;
    }
}
