package level0.문자열밀기;

public class Solution {
    public int solution(String A, String B) {

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B))
                return i;

            // 오른쪽으로 한 칸 밀기
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
        }

        return -1;
    }
}
