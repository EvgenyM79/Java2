import java.util.ArrayList;
import java.util.List;
//import java.util.Comparator;
import java.util.Collections;


//public int [] masInt = new int[] {2,6,8,4,6,13,56,76,45,37,98};
public class Main2 {

    public static void main(String[] args) {
        int [] masInt = new int[] {2,6,8,4,6,13,56,76,45,37,98};
        List<Integer> listInt = new ArrayList<>();
        List<Integer> listIntSort = new ArrayList<>();
        //System.out.println(listInt);
        for (int i = 0; i < masInt.length; i++) {
            listInt.add(masInt[i]);
        }
        System.out.println("Первоначальный массив типа Int: " + listInt);

        //добавление элемента в массив в конец
        listInt.add(45);
        System.out.println("Добавление элемента (45) в конец массива: " + listInt);

        // добавление элемента в массив в определенную позицию)
        listInt.add(5,55);
        System.out.println("Добавление элемента (55) в позицию (5) в массива: " + listInt);

        // вывод количество элементов массива
        System.out.println("Вывод количество элементов массива: " + listInt.size());

        //удаление элемента массива по индексу
        listInt.remove(7);
        System.out.println("Удаление элемента массива по индексу(7): " + listInt);

        //изменения значения по его индексу
        listInt.set(9,44);
        System.out.println("Изменения элемента массива с индексом(9) на 44: " + listInt);

        //функция вывода на экран всего массива
        System.out.println("Функция вывода на экран всего массива: " + listInt);

        // функцию сортировки массива (по возрастанию и убыванию без изменения исходного массива)
        // Неправильный подход
        /*listIntSort = listInt;
        listIntSort.sort(Comparator.naturalOrder());
        System.out.println("Cортировки массива по возрастанию: " + listIntSort);

        listIntSort = listInt;
        listIntSort.sort(Comparator.reverseOrder());
        System.out.println("Cортировки массива по убыванию: " + listIntSort);

        //функцию вывода максимального/минимального элемента
        System.out.println("Вывод минимального элемента: " + Collections.min(listInt));
        System.out.println("Вывод максимального элемента: " + Collections.max(listInt));
        */

        Collections.fill(listInt,122);
        System.out.println("Функцию заполнения массива одинаковыми элементами: " + listInt);



    }
}
