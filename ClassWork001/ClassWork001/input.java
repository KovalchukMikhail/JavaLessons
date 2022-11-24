package ClassWork001;

import java.util.Scanner;

public class input {
    public static int inputInt(String text)
    {
        while(true)
        {
            System.out.println(text);
            Scanner iScanner = new Scanner(System.in);
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
}
