package HomeWork005;

public class Controller {
    public static void run(){
        int number = View.start();
        int result = Model.func(number);
        View.showResult(number, result);
    }
}
