public class ClassSort {

    public static void sortAll(TempCar[] tempAllCar, int n){
        TempCar chCar = new TempCar(0, "",0,0,0,0);
        int num = n;

        // Пузырьковая сортировка по пробегу km
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++){
                if (tempAllCar[i].km > tempAllCar[j].km){
                    chCar = tempAllCar[i];
                    tempAllCar[i] = tempAllCar[j];
                    tempAllCar[j] = chCar;
                }
            }
        }

        System.out.println("Список авто отсортированный по пробегу (по возрастанию)");
        for (int i = 0; i < num; i++) {
            System.out.println("М:"+ tempAllCar[i].model + " Гос№:" + tempAllCar[i].gosNum + " Пр: " + tempAllCar[i].km +  " расход:" + tempAllCar[i].prkm + " цена:" + tempAllCar[i].cena + " доп пр: " + tempAllCar[i].pBigAvto);
        }

        // Пузырьковая сортировка по пробегу и доп параметр, только если одинаковый пробег.
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++){
                if (tempAllCar[i].km == tempAllCar[j].km && tempAllCar[i].pBigAvto > tempAllCar[j].pBigAvto ){
                    chCar = tempAllCar[i];
                    tempAllCar[i] = tempAllCar[j];
                    tempAllCar[j] = chCar;
                }
            }
        }

        System.out.println("Список авто отсортированный по пробегу (по возрастанию) и по доп. параметру");
        for (int i = 0; i < num; i++) {
            System.out.println("М:"+ tempAllCar[i].model + " Гос№:" + tempAllCar[i].gosNum + " Пр: " + tempAllCar[i].km +  " расход:" + tempAllCar[i].prkm + " цена:" + tempAllCar[i].cena + " доп пр: " + tempAllCar[i].pBigAvto);
        }
        //System.out.println("Не удалосб уменьшить кол-во объектов с " +  tempAllCar.length + " до " + n);
    }
}
