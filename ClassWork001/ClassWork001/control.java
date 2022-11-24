package ClassWork001;

import java.util.ArrayList;

public class control {
    public static void Run()
    {
        view data = new view();
        System.out.println("a=" + data.a + "; " + "b=" + data.b + "; " + "c=" + data.c + "; " + "d=" + data.d);
        module calculation = new module();
        int count = calculation.CountAnswers(data.a, data.b, data.c, data.d);
        data.ShowCount(count);
        if (count > 0)
        {
            ArrayList <Integer> numbers = calculation.GetNumbers(data.a, data.b, data.c, data.d);
            data.ShowNumbers(numbers);
        }
        
    }
}
