//Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Massiv5 {
    public static void main(String[] args) {
        int[ ] Arr = {1, 5, 10, 15, 16, -3};
        int min = Arr[0];
        int max = Arr[0];
        for (int i=0;i<Arr.length;i++){
            if(Arr[i]>min){
                min=Arr[i];
            }
            if(Arr[i]<max){
                max=Arr[i];
            }

        }
        System.out.println(min + " " +max);
    }
}

