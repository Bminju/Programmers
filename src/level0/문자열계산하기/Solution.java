package level0.문자열계산하기;

class Solution {
    public int solution(String my_string) {
        int answer;
        String[] arr = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);

        for(int i = 1; i < arr.length; i+=2){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }else{
                answer -= Integer.parseInt(arr[i+1]);
            }
        }

        return answer;
    }
}