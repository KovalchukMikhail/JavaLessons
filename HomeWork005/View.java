package HomeWork005;

public class View {
    public static int start() {
        Input inputInt = new Input();
        int result = inputInt.inputInt("Введите целое число больше 0");
        return result;
    }

    public static void showResult(int number, int result){
        System.out.println(number + "-е треугольное число равно: " + result);
    }
}
