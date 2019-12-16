public class Massiv6{
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};
        int[] arr3 = {10, 10,};

        System.out.println(checkMid(arr1));
        System.out.println(checkMid(arr2));
        System.out.println(checkMid(arr3));

    }
    private static boolean checkMid (int[] arrayToCheck) {
        int leftSum = 0;
        int rightSum = 0;
        boolean result = false;


        // минимальное число элементов для поиска очевидно 2

        if (arrayToCheck.length > 1) {
            for (int i = 0; i < arrayToCheck.length / 2; i++) {
                leftSum += arrayToCheck[i];
                rightSum += arrayToCheck[arrayToCheck.length - 1 - i];

                //нечетные числа Java откругляет в меньшую сторону
                //поэтому к правой сумме нужно прибавить еше один элемент


                if (i == (arrayToCheck.length / 2 - 1) && arrayToCheck.length % 2 != 0) {
                    rightSum += arrayToCheck[arrayToCheck.length - 2 - i];
                }
            }

            //если левая сумма меньше правой, то продолжаем движение вправо
            // увеличивая левую сумму и уменьшая правую. И наоборот


            if (leftSum < rightSum) {
                for (int i = arrayToCheck.length / 2; i < arrayToCheck.length; i++) {
                    leftSum += arrayToCheck[i];
                    rightSum += arrayToCheck[i];

                    if (leftSum == rightSum) {
                        result = true;
                        printArray(arrayToCheck, i);
                        break;
                    }
                }
            } else if (leftSum > rightSum) {
                for (int i = arrayToCheck.length / 2; i < arrayToCheck.length; i++) {
                    leftSum -= arrayToCheck[i];
                    rightSum += arrayToCheck[i];

                    if (leftSum == rightSum) {
                        result = true;
                        printArray(arrayToCheck, i);
                        break;
                    }
                }
            }

            // если суммы равны в центре, то печатаем массив
            else {
                result = true;
                printArray(arrayToCheck, arrayToCheck.length / 2 - 1);
            }
        } else {
            System.out.print("Передан слишком короткий массив");
        }
        return result;

    }
    static void printArray( int[] arrayToPrint, int middleIndex){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + "");

            if (i == middleIndex)
                System.out.print(" || ");
        }
    }
}

