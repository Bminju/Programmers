package level0.캐릭터의좌표;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        //좌표 한계
        int maxX = board[0] / 2;
        int minX = (board[0] / 2)*-1;
        int maxY = board[1] / 2;
        int minY = (board[1] / 2)*-1;

        Map<String, int[]> directionMap = new HashMap<>();
        directionMap.put("left", new int[]{-1, 0});
        directionMap.put("right", new int[]{1, 0});
        directionMap.put("up", new int[]{0,1});
        directionMap.put("down", new int[]{0,-1});

        //시작 위치
        int[] start = {0,0};

        for(String key : keyinput) {
            int[] move = directionMap.get(key);
            int newX = start[0] + move[0];
            int newY = start[1] + move[1];
            //범위 체크
            if(newX >= minX && newX <= maxX) {
                start[0] = newX;
            }
            if(newY >= minY && newY <= maxY){
                start[1] = newY;
            }
        }
        return start;
    }
}