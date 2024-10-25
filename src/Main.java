import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Задание 1. Удаление отрицательных значений из массива
//        Реализуйте метод, который принимает на вход целочисленный массив и
//        удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//        только неотрицательные числа.
//                Пример:
//          [-1, 2, -3, 4, -5, 6]
//        Результат:
//          [2, 4, 6]

        int[] arr = {-1, 2, -3, 4, -5, 6};
        System.out.println(Arrays.toString(positiveNumbers(arr)));

    }
    public static int[] positiveNumbers(int[] arr) {
        ArrayList<Integer> list_positive = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                list_positive.add(arr[i]);
            }
        }
        int[] arr_positive = list_positive.stream().mapToInt(i -> i).toArray();
        return arr_positive;

    }
}
