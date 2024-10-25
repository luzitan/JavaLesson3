public class Task4 {
//    Задача 4*. Среднее значение массива
//    Напишите метод, который принимает массив целых чисел и возвращает
//    среднее значение элементов массива, округленное до ближайшего целого
//    числа.
//            Пример:
//            [4, 2, 7, 5, 1]
//    Результат:
//            4

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 5, 1};
        System.out.println(sredNum(arr));

    }
    public static int sredNum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        float sumF = sum;
        float lengthF = arr.length;
        float sredZnach = sumF / lengthF;
        int round = Math.round(sredZnach);
        return round;
    }
}
