package level0.칠의개수;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int a : array) {
            String str = Integer.toString(a);
            char[] charArray = str.toCharArray();
            for (char ch : charArray){
                if(ch == '7'){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
