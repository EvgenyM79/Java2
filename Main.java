public class Main {

    public static void main(String[] args) {
        int[] masInt = new int[]{1,4,7,9,12,45,3};
        ClassInt masNew = new ClassInt(masInt);
        masNew.show();
        System.out.println("Добавление элемента 77 в конец");
        masNew.addIntToEnd(77);
        masNew.show();
        System.out.println("Добавление элемента 32 в позицию 4");
        masNew.addIntToPosition(32,4);
        masNew.show();
        System.out.println("Удаление элемента в позиции 6");
        masNew.delIntInPosition(6);
        masNew.show();
        System.out.println("Изменение занчения на 55 в позиции 2");
        masNew.replaceIntInPosition(55,2);
        masNew.show();
        masNew.sortInt("max");
        masNew.sortInt("min");
        System.out.println("Исходный массив");
        masNew.show();
        System.out.println("Найден максимальный элемент " + masNew.findInt("max"));;
        System.out.println("Найден минимальный элемент " + masNew.findInt("min"));;
        System.out.println("Заполнение массива одинаковыми элементами 7");;
        masNew.replaceAllInt(7);
        masNew.show();
    }
}
