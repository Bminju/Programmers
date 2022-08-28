package level1.p와y의개수;

public class solution {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split(""); //대소문자 무시 -> 전부 소문자로 변환

        for (int i = 0; i < array.length; i++) {
            if ("p".equals(array[i])) {
                pCount++;
            } else if ("y".equals(array[i])) {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return true;
    }
}
