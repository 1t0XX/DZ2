//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по нему циклом, и числа, меньшие 6, умножить на 2;


public class Massiv3 {

    public static void main(String[] args) {

        int [] Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for(int x: Arr){
                if(x<6){
                    x*=2;
                }
                System.out.println(x);
            }

        }
    }


