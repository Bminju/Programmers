package level0.다항식더하기;

public class Solution {
    public String solution(String polynomial) {
        int xNumber = 0;
        int num = 0;
        String[] arr = polynomial.split(" ");
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i].contains("x")) {
                String str = arr[i].replace("x", "");
                if (str.equals("")) {
                    xNumber += 1;
                } else {
                    xNumber += Integer.parseInt(str);
                }
            } else {
                num += Integer.parseInt(arr[i]);
            }
        }
        StringBuilder answer = new StringBuilder();
        if (xNumber > 0) {
            answer.append(xNumber == 1 ? "x" : xNumber + "x");
        }
        if (num > 0) {
            if (answer.length() > 0 && num > 0) answer.append(" + ");
            answer.append(num);
        }
        return answer.length() > 0 ? answer.toString() : "0";
    }
}