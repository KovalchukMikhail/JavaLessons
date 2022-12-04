package HomeWork004;

    /**
    * Содержит метод для реализации вывода результатов.
    */
public class View {
    /**
    * отрисовывает карту
    */
    public static void drawMap(int[][] map){
        int sizeY = map.length;
        int sizeX = map[0].length;
        for (int i = 0; i < sizeY; i++){
            for(int j = 0; j < sizeX; j++){
                if(map[i][j] == -1)System.out.print('█');
                else if(map[i][j] == 0)System.out.print(' ');
                else if(map[i][j] == -2)System.out.print('S');
                else if(map[i][j] == -3)System.out.print('F');
                else if(map[i][j] == -4)System.out.print('@');
                else System.out.print(" ");
            }
            System.out.println();
        }
    }


}
