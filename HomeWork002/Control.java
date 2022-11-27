package HomeWork002;

public class Control {
    public static void run(){
        View data = new View();
        int[] array = Module.CreatArray(data.min, data.max, data.size);
        data.showMessageWithArray("Исходный массив", array);
        Module.sortingArray(array);
        data.showMessageWithArray("Отсортированный массив", array);
    }
}
