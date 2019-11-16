public class ClassSort {

    public static void sortAll(ClassCar[] allCar){
        int num = allCar.length; // Длина массива автомашин
        // массивы и переменный для пузырьковой сортировки
        int [] maskm = new int[num]; // массив по км
        int vrenkm; // временная переменная для перестановки (для массива км)
        int [] masSortkm = new int[num]; // массив номер элемента
        int vremSortMaskm; // временная переменная для перестановки (для массива номер элемента)
        int [] maspBigAvto = new int[num]; // массив доп. параметров
        int vrenpBigAvto; // // временная переменная для перестановки (для массива доп. параметр)

        // Создаем массивы взяв значения из массива объектов машин
        for (int i = 0; i < num; i++) {
            maskm[i] = allCar[i].km;
            maspBigAvto[i] = allCar[i].pBigAvto;
            masSortkm[i] = i;
        }

        // Пузырьковая сортировка по пробегу km
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++){
                if (maskm[i] > maskm [j]){
                    vrenkm = maskm[i];
                    maskm[i] = maskm[j];
                    maskm[j] = vrenkm;
                    vremSortMaskm = masSortkm[i];
                    masSortkm[i] = masSortkm[j];
                    masSortkm[j] = vremSortMaskm;
                    vrenpBigAvto = maspBigAvto[i];
                    maspBigAvto[i] = maspBigAvto[j];
                    maspBigAvto[j] = vrenpBigAvto;
                }
            }
        }

        /*System.out.println("Список авто отсортированный по пробегу (по возрастанию)");
        for (int i = 0; i < num; i++) {
            if (allCar[masSortkm[i]].pBigAvto > 0) {
                System.out.println("Тип: C" + allCar[masSortkm[i]].model + " гос номер:" + allCar[masSortkm[i]].gosNum + " пробег:" + allCar[masSortkm[i]].km + " доп. параметр:" + allCar[masSortkm[i]].pBigAvto);
            } else {
                System.out.println("Тип: C" + allCar[masSortkm[i]].model + " гос номер:" + allCar[masSortkm[i]].gosNum + " пробег:" + allCar[masSortkm[i]].km);
            }
        }*/

        // Пузырьковая сортировка по доп. параметру. По уже отсортированному массиву пробег и только если одинаковый пробег.
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++){
                if (maskm[i] == maskm[j] && maspBigAvto[i] > maspBigAvto[j] ){
                    vrenkm = maskm[i];
                    maskm[i] = maskm[j];
                    maskm[j] = vrenkm;
                    vremSortMaskm = masSortkm[i];
                    masSortkm[i] = masSortkm[j];
                    masSortkm[j] = vremSortMaskm;
                    vrenpBigAvto = maspBigAvto[i];
                    maspBigAvto[i] = maspBigAvto[j];
                    maspBigAvto[j] = vrenpBigAvto;
                }
            }
        }

        System.out.println("Список авто отсортированный по пробегу (по возрастанию) и по доп. параметру");
        for (int i = 0; i < num; i++) {
            if (allCar[masSortkm[i]].pBigAvto > 0) {
                System.out.println("Тип:C" + allCar[masSortkm[i]].model + " гос номер:" + allCar[masSortkm[i]].gosNum + " пробег:" + allCar[masSortkm[i]].km + " доп. параметр:" + allCar[masSortkm[i]].pBigAvto);
            } else {
                System.out.println("Тип:C" + allCar[masSortkm[i]].model + " гос номер:" + allCar[masSortkm[i]].gosNum + " пробег:" + allCar[masSortkm[i]].km);
            }
        }
    }
}
