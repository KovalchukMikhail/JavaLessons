package ClassWork002;

public class control {
    public static void Run()
    {
        int min = -9;
        int max = 9;
        int size = 12;

        int[] arrayFirst = module.CreatArray(min, max, size);
        int[] result = module.AmountValues(arrayFirst);
        view.ShowArray(arrayFirst);
        view.ShowResult(result);

    }
}
