package HomeWork003.task;

    /**
    * Содержит методы реализующие решение задачи
    */
public class Module {
    /**
    * Вычесляет количество возможных маршрутов преобразовани числа а в число b.
    * Возвращает переменную типа long
    */
    public static long CountAnswers(int numA, int numB, int numC, int numD) {
        long [] arrayAnswers = new long[numB+1];
        arrayAnswers[numA] = 1;
        for(int i = numA+1; i < numB+1; i++){
            if(i / numC >= numA && i % numC == 0){
                arrayAnswers[i] += arrayAnswers[i / numC];
            }
            if(i - numD >= numA){
                arrayAnswers[i] += arrayAnswers[i - numD];
            }
        }
        return arrayAnswers[numB];
    }

    /**
    * Записывает, в переменную типа String, и возвращает вариант маршрута преобразовани числа а в число b
    */
    public static String writeAnswer(int numA, int numB, int numC, int numD){
        String result = "";
        String typeOne = "(+" + numD + ")";
        String typeTwo = "(*" + numC + ")";
        while(numB != numA){
            if(numB % numC == 0 && numB / numC >= numA && numB / numC < numB - numD && numB - numD > numA){
                result = typeTwo + result;
                numB /= numC;
            }
            else if(numB - numD >= numA && numB - numD < numB / numC && numB % numC == 0 && numB / numC > numA){
                result = typeOne + result;
                numB -= numD;
            }
            else if(numB % numC == 0 && numB / numC >= numA && numB - numD <= numA){
                result = typeTwo + result;
                numB /= numC;
            }
            else if(numB - numD >= numA && (numB / numC < numA || numB % numC != 0)){
                result = typeOne + result;
                numB -= numD;
            }
        }
        return result;
    }
}

