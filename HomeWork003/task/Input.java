package HomeWork003.task;

import java.util.Scanner;
    /**
    * Класс содержит методы реализующие получение данных от пользователя путем ввода с клавиатуры в консоль.
    */
public class Input {
    Scanner iScanner;
    /**
    * Возвращает переменную типа Integer введенную пользователем в консоль. В случае исключения повторно запрашивает от пользователя ввод значения.
    */
    public int inputInt(String text)
    {
        while (true) {
            System.out.println(text);
            iScanner = new Scanner(System.in);
            try
            {
                int result = iScanner.nextInt();
                return result;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void scanerClose(){
        iScanner.close();
    }
}
