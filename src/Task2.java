import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class Task2 {
//    Задача 2. Уникальные числа
//    Напишите метод, который принимает целочисленный массив и возвращает
//    новый массив, содержащий только уникальные элементы из исходного
//    массива.
//    Пример:
//            [1, 2, 2, 3, 4, 4, 5]
//    Результат:
//            [1, 2, 3, 4, 5]
public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 5};
    System.out.println(Arrays.toString(uniqueElements(arr)));

}
public static int[] uniqueElements(int[] arr) {
    ArrayList<Integer> listUnique = new ArrayList<>();
    for (int num: arr) {
        if(!listUnique.contains(num)){
            listUnique.add(num);
        }
    }
    int[] arrUnique = listUnique.stream().mapToInt(i -> i).toArray();
    return arrUnique;

}
}
