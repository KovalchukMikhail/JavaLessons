package HomeWork004;

public class Controller {
    public static void run(){
        int[] size = View.startGame();
        Model currentGame = new Model();
        int[][] map = currentGame.createMap(size);
        currentGame.fillMap(map);
        View.drawMap(map);
    }
}
