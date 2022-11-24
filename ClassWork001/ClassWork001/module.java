package ClassWork001;

import java.util.ArrayList;

public class module {
    int count = 0;
    public int CountAnswers(int numA, int numB, int numC, int numD)
    {   
        if (numA > numB) return count;
        if (numA == numB) count++;
        CountAnswers(numA + numD, numB, numC, numD);
        CountAnswers(numA * numC, numB, numC, numD);
        return count;
    }

    public ArrayList <Integer> GetNumbers(int numA, int numB, int numC, int numD)
    {
        ArrayList <Integer> numbers = new ArrayList <Integer>();
        int i = 1;
        while(numbers.size() < count)
        {
            String tempBinaryString = Integer.toBinaryString(i);
            Integer currentNumber = numA;
            for (int j = 1; j < tempBinaryString.length(); j++)
            {
                if (tempBinaryString.charAt(j) == '0') currentNumber += numD;
                else currentNumber *= numC;
                if (currentNumber > numB) break;
            }

            if (currentNumber == numB)
            {
                numbers.add(i);
            }
            i++;
            // System.out.println(currentNumber);
        }
        return numbers;

    }
}

