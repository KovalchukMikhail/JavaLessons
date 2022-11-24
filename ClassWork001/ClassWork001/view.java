package ClassWork001;

import java.util.ArrayList;
import java.util.Random;

public class view {
    int a;
    int b;
    int c;
    int d;

    public view()
    {
        a = input.inputInt("Введите число a: ");
        b = input.inputInt("Введите число b: ");
        if(input.inputInt("Для самостоятельного ввода значений с и d введите 1 или 0 для случайного ввода") == 1)
        {
            c = input.inputInt("Введите число c: ");
            d = input.inputInt("Введите число d: ");
        }
        else
        {
            int min = input.inputInt("Введите минимальное возможное значение числел с и d: ");
            int max = input.inputInt("Введите Максимальное возможное значение числел с и d: ");
            Random random = new Random();
            c = random.ints(min, (max + 1)).findFirst().getAsInt();
            d = random.ints(min, (max + 1)).findFirst().getAsInt();
        }
    }

    public void ShowCount(int count)
    {
        if (count == 0) System.out.println("Решения нет");
        else System.out.println("Ответ: " + count);
    }

    public void ShowNumbers (ArrayList <Integer> numbers)
    {
        String str = "";
        String typeOne = "(+" + d + ")";
        String typeTwo = "(*" + c + ")";
        if(input.inputInt("Для вывода самого короткого сочетания команд введите '0' для вывода всех сочетаний '1'") == 0)
        {
            str += Integer.toBinaryString(numbers.get(0)).substring(1).
                                                    replace("0", "b").replace("1", "a").
                                                    replace("a", typeTwo).replace("b", typeOne) + "\n";
            System.out.println("Самое короткое сочетание команд:\n" + str);
        }
        else
        {
            for (int i = 0; i < numbers.size(); i++)
            {
                str += Integer.toBinaryString(numbers.get(i)).substring(1).
                                                        replace("0", "b").replace("1", "a").
                                                        replace("a", typeTwo).replace("b", typeOne) + "\n";
            }
            System.out.println("Возможные сочетания команд:\n" + str);
        }


    }
}
