import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;


//public int [] masInt = new int[] {2,6,8,4,6,13,56,76,45,37,98};
public class MasArrayList {

    public static List<Integer> listInt = new ArrayList<>();

    public static void addNum(int a){
        listInt.add(a);
        System.out.println("Добавление элемента (" + a + ") в конец массива: " + listInt);
    }

    public static void addNumIndex(int index, int a){
        listInt.add(index,a);
        System.out.println("Добавление элемента (" + a + ") в позицию (" + index + ") в массива: " + listInt);
    }

    public static void printNumMas(){
        System.out.println("Вывод количество элементов массива: " + listInt.size());
    }

    public static void delNumIndex(int index){
        listInt.remove(index);
        System.out.println("Удаление элемента массива по индексу(" + index + "): " + listInt);
    }

    public static void setNumIndex(int index, int a){
        listInt.set(index,a);
        System.out.println("Изменения элемента массива с индексом(" + index + ") на " + a + ": " + listInt);
    }

    public static void printMas(){
        System.out.println("Функция вывода на экран всего массива: " + listInt);
    }

    public static void sortUpMas(){
        ArrayList copy = new ArrayList(listInt);
        copy.sort(Comparator.naturalOrder());
        System.out.println("Cортировки массива по возрастанию: " + copy);
    }

    public static void sortDownMas(){
        ArrayList copy = new ArrayList(listInt);
        copy.sort(Comparator.reverseOrder());
        System.out.println("Cортировки массива по убыванию: " + copy);
    }

    public static void printMin(){
        System.out.println("Вывод минимального элемента: " + Collections.min(listInt));
    }

    public static void printMax(){
        System.out.println("Вывод максимального элемента: " + Collections.max(listInt));
    }

    public static void fillAllMas(int a){
        Collections.fill(listInt,a);
        System.out.println("Функцию заполнения массива одинаковым числом = " + a + " : " + listInt);
    }

    public static void main(String[] args) {
        int [] masInt = new int[] {2,6,8,4,6,13,56,76,45,37,98};
        //List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < masInt.length; i++) {
            listInt.add(masInt[i]);
        }
        System.out.println("Первоначальный массив типа Int: " + listInt);

        //добавление элемента в массив в конец
        addNum(45);
        printMas();

        // добавление элемента в массив в определенную позицию)
        addNumIndex(5,55);

        // вывод количество элементов массива
        printNumMas();

        //удаление элемента массива по индексу
        delNumIndex(7);

        //изменения значения по его индексу
        setNumIndex(9,44);

        //функция вывода на экран всего массива
        printMas();

        // функцию сортировки массива (по возрастанию и убыванию без изменения исходного массива)
        sortUpMas();
        sortDownMas();

        System.out.println("Вывод массива после сортировки: " + listInt);

        //функцию вывода максимального/минимального элемента
        printMin();
        printMax();

        fillAllMas(23);
    }
}
