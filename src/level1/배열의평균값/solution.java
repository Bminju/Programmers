package level1.배열의평균값;

public class solution {
    public double solution(int[] arr) {
        double answer, sum = 0;
        for (int i:arr) {
            sum += i;
        }
        answer = sum / arr.length ;

        return answer;
    }
}


