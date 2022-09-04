package level1.부족한금액;

public class solution {
    class Solution {
        public long solution(int price, int money, int count) {
            long total = 0;
            for (int i = 1; i <= count; i++) {
                total += price * i;
            }
            if(total - money < 0) {
                return 0;
            }else{
                return total - money;
            }
        }
    }
}
