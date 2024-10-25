import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
//    Задача 3. Длина слов
//    Реализуйте метод, который принимает на вход массив строк и возвращает
//    новый массив, содержащий только строки, длина которых больше 3 символов.
//            Пример:
//            ["cat", "elephant", "dog", "giraffe"]
//    Результат:
//            ["elephant", "giraffe"]

    public static void main(String[] args) {
        String[] arr = {"cat", "elephant", "dog", "giraffe"};
        System.out.println(Arrays.toString(longStr(arr)));

    }
    public static String[] longStr(String[] arr) {
        ArrayList<String> listLongStr = new ArrayList<>();
        for (String a : arr) {
            if (a.length() > 3) {
                listLongStr.add(a);
            }
        }
        String[] arrLongStr = listLongStr.toArray(new String[listLongStr.size()]);
        return arrLongStr;

    }

}
