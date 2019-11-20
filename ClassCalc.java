public class ClassCalc {

    public static int n, doubleCar;

    public static void calcAll(TempCar[] tempAllCar){
        double[] allkm = {0,0,0,0};
        TempCar chCar = new TempCar(0, "",0,0,0,0);
        n = tempAllCar.length;
        doubleCar = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tempAllCar[i].model == tempAllCar[j].model && tempAllCar[i].gosNum.equals(tempAllCar[j].gosNum) && tempAllCar[i].model > 0 && tempAllCar[j].model > 0) {
                    System.out.println(tempAllCar[i].km);
                    tempAllCar[i].km += tempAllCar[j].km;
                    System.out.println(tempAllCar[i].km);
                    tempAllCar[i].pBigAvto += tempAllCar[j].pBigAvto;
                    tempAllCar[j].model = 0;
                    tempAllCar[j].km = 0;
                    tempAllCar[j].pBigAvto = 0;

                    //tempAllCar[j] = tempAllCar[n];
                    //tempAllCar[n] = null;
                    doubleCar ++;
                }
            }

            switch (tempAllCar[i].model) {
                case 100: {
                    //System.out.println(tempAllCar[i].model + " " + tempAllCar[i].gosNum + " " + tempAllCar[i].km + " " + tempAllCar[i].pBigAvto + " длина = 3");
                    allkm[0]+= tempAllCar[i].km * tempAllCar[i].prkm * tempAllCar[i].cena / 100;
                    //System.out.println(allkm[0]);
                    break;
                }
                case 200: {
                    //System.out.println(tempAllCar[i].model + " " + tempAllCar[i].gosNum + " " + tempAllCar[i].km + " " + tempAllCar[i].pBigAvto + " длина = 4");
                    allkm[1]+= tempAllCar[i].km * tempAllCar[i].prkm * tempAllCar[i].cena / 100;
                    //System.out.println(allkm[1]);
                    break;
                }
                case 300: {
                    //System.out.println(tempAllCar[i].model + " " + tempAllCar[i].gosNum + " " + tempAllCar[i].km + " " + tempAllCar[i].pBigAvto + " длина = 4");
                    allkm[2]+= tempAllCar[i].km * tempAllCar[i].prkm * tempAllCar[i].cena / 100;
                    //System.out.println(allkm[2]);
                    break;
                }
                case 400: {
                    //System.out.println(tempAllCar[i].model + " " + tempAllCar[i].gosNum + " " + tempAllCar[i].km + " " + tempAllCar[i].pBigAvto + " длина = 4");
                    allkm[3]+= tempAllCar[i].km * tempAllCar[i].prkm * tempAllCar[i].cena / 100;
                    //System.out.println(allkm[3]);
                    break;
                }
            }
        }
        System.out.println("Расход для легковых авто(C100) составил " + allkm[0]);
        System.out.println("Расход для грузовых авто(C200) составил " + allkm[1]);
        System.out.println("Расход для посажирских авто(C300) составил " + allkm[2]);
        System.out.println("Расход для тяжелой техники (краны)(C400) составил " + allkm[3]);
        System.out.println("Общий расход составил " + (allkm[0] +allkm[1] + allkm[2] + allkm[3]));
        double minSum = allkm[0], maxSum = 0;
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < 4; i++){
            if (allkm[i] < minSum ){
                minSum = allkm[i] ;
                minIndex = i;
            }
            if (allkm[i] > maxSum ){
                maxSum = allkm[i];
                maxIndex = i;
            }
        }
        System.out.println("Минимальный расход для модели авто C" + tempAllCar[minIndex].model + " равен " + allkm[minIndex]);
        System.out.println("Максимальный расход для модели авто C" + tempAllCar[maxIndex].model + " равен " + allkm[maxIndex]);
        Main.n = n - doubleCar;
    }
}
