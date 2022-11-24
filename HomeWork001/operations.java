package HomeWork001;

public class operations {

    public static String Exponentiation (double numFirst, int numSecond)
    {
        if (numFirst == 0 && numSecond == 0) return "Не определено";
        if (numSecond == 0) return "1";
        if (numSecond > 0) return SimpleExponentiation(numFirst, numSecond) + "";
        else return 1 / SimpleExponentiation(numFirst, numSecond * (-1)) + "";
    }
    
    public static double SimpleExponentiation (Double numFirst, int numSecond)
    {
        if (numSecond == 1) return numFirst;
        if (numSecond % 2 == 0)
        {
            numFirst = SimpleExponentiation (numFirst * numFirst, numSecond / 2);
            return numFirst;
        }
        else
        {
            numFirst *= SimpleExponentiation (numFirst * numFirst, (numSecond - 1) / 2);
            return numFirst;
        }
    }
}
