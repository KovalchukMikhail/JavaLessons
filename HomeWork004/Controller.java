package HomeWork004;

public class Controller {
    public static void run(){
        int height = 30;
        int width = 60;
        int[] size = {height, width};
        Model currentGame = new Model();
        int[][] map = currentGame.createMap(size);
        currentGame.fillMap(map);
        currentGame.searchWay(map);
        View.drawMap(map);
    }
}
