package HomeWork003.task;

/**
 * Класс содержит метод обрабатывающий запрос пользователя и передающий результат для отображения.
 */
public class Controller {
    /**
    * Обрабатывает данные и передает результат для отображения.
    */
    public static void Run()
    {
        View data = new View();
        if(data.a < data.b){
            long count = Module.CountAnswers(data.a, data.b, data.c, data.d);
            data.showAnswer("Ответ: " + count);
            if (count > 0)
            {
                data.showAnswer("Вариант маршрута преобразования числа " + data.a + " в  число " + data.b + "\n"
                + Module.writeAnswer(data.a, data.b, data.c, data.d));
            }
        }
        else if (data.a == data.b) data.showAnswer("Число а равно числу b");
        else data.showAnswer("Решения нет");  
    }
}
