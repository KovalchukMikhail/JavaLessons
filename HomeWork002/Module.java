package HomeWork002;
import java.util.Random;

public class Module {
    public static int[] CreatArray(int min, int max, int size)
    {
        int [] array = new int [size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array [i] = random.ints(min, max).findFirst().getAsInt();
        }

        return array;
    }

    public static int [] getPartArray(int [] array, int start, int finish){
        int [] result = new int [finish - start];
        for (int i = start, j = 0; i < finish; i++, j++) {
            result [j] = array [i];   
        }
        return result;
    }

    public static int [] sortingArray(int[] array){
        if (array.length == 0 || array.length == 1) return array;
        int [] arrayFirst = sortingArray(getPartArray(array, 0, array.length/2));
        int [] arraySecond = sortingArray(getPartArray(array, array.length/2, array.length));
        int i = 0, j = 0, k = 0;
        while (i < array.length) {
            if (j < arrayFirst.length && k < arraySecond.length){
                if(arrayFirst[j] <= arraySecond[k]){
                    array[i] = arrayFirst[j];
                    i++;
                    j++;
                }
                else{
                    array[i] = arraySecond[k];
                    i++;
                    k++;
                }
            }
            else if (j < arrayFirst.length){
                array[i] = arrayFirst[j];
                i++;
                j++;
            }
            else{
                array[i] = arraySecond[k];
                i++;
                k++;
            }
        }
        return array;

    }
}
