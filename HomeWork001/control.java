package HomeWork001;

public class control {
    public static void Run() throws Exception
    {
        String pathForRead = "HomeWork001/input.txt";
        String pathForWrite = "HomeWork001/output.txt";
        workWithFile file = new workWithFile(pathForRead);
        String result = operations.Exponentiation(file.numFirst, file.numSecond);
        file.WriteInFile(pathForWrite, result);
    }
}
