//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами;




public class Massiv4 {

    public static void main(String[] args) {
        int[][] Arr = new int[4][4];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0, j2 = Arr[i].length; j < Arr[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) Arr[i][j] = 1;
                System.out.print(Arr[i][j]);
            }
        }
    }
}