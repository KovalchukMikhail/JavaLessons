package HomeWork001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class workWithFile {
    double numFirst;
    int numSecond;
    
    public workWithFile(String path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str = "";
        while ((str = br.readLine()) != null)
        {
            if (str.startsWith("a")) numFirst = Double.valueOf(str.split(" ")[1]);
            if (str.startsWith("b")) numSecond = Integer.valueOf(str.split(" ")[1]);
        }
        br.close();
    }

    public void WriteInFile(String path, String result)
    {
        try (FileWriter fw = new FileWriter(path, false))
        {
            fw.write(result);
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
