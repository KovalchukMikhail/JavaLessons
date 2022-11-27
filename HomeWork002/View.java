package HomeWork002;

public class View {
    int min;
    int max;
    int size;

    public View(){
        Input input = new Input();
        min = input.inputInt("Введите минимальное возможное значение числел в массиве (целое число): ");
        max = input.inputInt("Введите максимальное возможное значение числел в массиве (целое число): ");
        do {
            size = input.inputInt("Введите длинну массива (целое положительное число): ");
        } while (size < 0);
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        input.scanerClose();  
    }

    public void showArray(int [] array) {
        {
            System.out.print("[");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println("]");
        }
    }

    public void showMessageWithArray(String text, int array []){
        System.out.println(text);
        showArray(array);
    }
}
