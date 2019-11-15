public class ClassSort {

    public static void sortAll(ClassCar[] allCar,  double[][] masVes){
        int num = allCar.length;
        int [] maskm = new int[num];
        int vrenkm;
        int [] masSortkm = new int[num];
        int vremSortMaskm;
        int [] maspBigAvto = new int[num];
        int vrenpBigAvto;

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

        // Пузырьковая сортировка по пробегу и доп параметр, только если одинаковый пробег.
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
                System.out.println("Тип: C" + allCar[masSortkm[i]].model + " гос номер:" + allCar[masSortkm[i]].gosNum + " пробег:" + allCar[masSortkm[i]].km + " доп. параметр:" + allCar[masSortkm[i]].pBigAvto);
            } else {
                System.out.println("Тип: C" + allCar[masSortkm[i]].model + " гос номер:" + allCar[masSortkm[i]].gosNum + " пробег:" + allCar[masSortkm[i]].km);
            }
        }
    }
}
