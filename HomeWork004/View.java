package HomeWork004;

public class View {
    public static int[] startGame(){
        int [] result = new int [2];
        Input scanerInt = new Input();
        result [0] = scanerInt.inputInt("Введите высоту поля");
        result [1] = scanerInt.inputInt("Введите ширину поля");
        return result;
    }
    public static void drawMap(int[][] map){
        int sizeY = map.length;
        int sizeX = map[0].length;
        for (int i = 0; i < sizeY; i++){
            for(int j = 0; j < sizeX; j++){
                if(map[i][j] == -1)System.out.print('#');
                else if(map[i][j] == 0)System.out.print(' ');
                else if(map[i][j] == -2)System.out.print('S');
                else if(map[i][j] == -3)System.out.print('F');
                else System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    
}
