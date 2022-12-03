package HomeWork004;

import java.util.LinkedList;
import java.util.Random;

public class Model {
    int [] pointStart = new int[3];
    int [] pointFinish = new int[2];

    public int[][] createMap(int[] size){
        int[][] map = new int [size[0]][size[1]];

        for (int i = 0; i < size[1]; i++) map[0][i] = -1;
        for (int i = 0; i < size[1]; i++) map[size[0] - 1][i] = -1;
        for (int i = 0; i < size[0]; i++) map[i][0] = -1;
        for (int i = 0; i < size[0]; i++) map[i][size[1] - 1] = -1;

        Random random = new Random();
        int temp;

        for(int i = 1; i < size[0] - 1; i++){
            for(int j = 1; j < size[1] - 1; j++){
                temp = random.ints(0, 8).findFirst().getAsInt();
                if (temp == 7) map[i][j] = -1;
            }
        }
        int start = -2;
        int finish = -3;
        choosePoint(start, map);
        choosePoint(finish, map);
        return map;
    }

    public void choosePoint(int sign, int[][] map){
        int sizeY = map.length - 1;
        int sizeX = map[0].length - 1;
        int coordinateY;
        int coordinateX;
        boolean check = false;
        Random random = new Random();
        while(!check){
            coordinateY = random.ints(1, sizeY).findFirst().getAsInt();
            coordinateX = random.ints(1, sizeX).findFirst().getAsInt();
            if(map[coordinateY][coordinateX] == 0){
                map[coordinateY][coordinateX] = sign;
                if(sign == -2) {
                    pointStart[0] = coordinateY;
                    pointStart[1] = coordinateX;
                    pointStart[2] = 0;
                }
                if(sign == -3) {
                    pointFinish[0] = coordinateY;
                    pointFinish[1] = coordinateX;
                }
                check = true;
            } 
        }
    }

    public void fillMap(int[][] map){
        LinkedList<int[]> pointOnMap = new LinkedList<int[]>();
        pointOnMap.offer(pointStart);
        while(pointOnMap.peek() != null){
            int[] currentPoint = pointOnMap.poll();
            for (int i = -1; i < 2; i++){
                for (int j = -1; j < 2; j++){
                    if(map[currentPoint[0] + i][currentPoint[1] + j] == 0){
                        int[] temp = new int [3];
                        temp[0] = currentPoint[0] + i;
                        temp[1] = currentPoint[1] + j;
                        temp[2] = currentPoint[2] + 1;
                        pointOnMap.offer(temp);
                        map[currentPoint[0] + i][currentPoint[1] + j] = temp[2];
                    }
                }
            }
        }
    }

    public void searchWay(int[][] map){
        int[] curentPoint = pointFinish;
        

    }

}
