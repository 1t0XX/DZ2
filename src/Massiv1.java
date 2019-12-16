//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Massiv1 {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

                        for (int i=0; i<nums.length; i++) {
                            nums[i]=(nums[i]==1) ? 0 : 1;
                            System.out.println(nums[i] + "");
                            }
        }
}
