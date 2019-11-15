public class ClassCalc {

    public static void calcAll(ClassCar[] allCar,  double[][] masVes){
        for (int i = 0; i < allCar.length; i++) {
            switch (allCar[i].model) {
                case 100: {
                    //System.out.println(allCar[i].model + " " + allCar[i].gosNum + " " + allCar[i].km + " " + allCar[i].pBigAvto + " длина = 3");
                    masVes[0][3] += allCar[i].km * masVes[0][1] * masVes[0][2] / 100;
                    //System.out.println(masVes[0][3]);
                    break;
                }
                case 200: {
                    //System.out.println(allCar[i].model + " " + allCar[i].gosNum + " " + allCar[i].km + " " + allCar[i].pBigAvto + " длина = 4");
                    masVes[1][3] += allCar[i].km * masVes[1][1] * masVes[1][2] / 100;
                    //System.out.println(masVes[1][3]);
                    break;
                }
                case 300: {
                    //System.out.println(allCar[i].model + " " + allCar[i].gosNum + " " + allCar[i].km + " " + allCar[i].pBigAvto + " длина = 4");
                    masVes[2][3] += allCar[i].km * masVes[2][1] * masVes[2][2] / 100;
                    //System.out.println(masVes[2][3]);
                    break;
                }
                case 400: {
                    //System.out.println(allCar[i].model + " " + allCar[i].gosNum + " " + allCar[i].km + " " + allCar[i].pBigAvto + " длина = 4");
                    masVes[3][3] += allCar[i].km * masVes[3][1] * masVes[3][2] / 100;
                    //System.out.println(masVes[3][3]);
                    break;

                }
            }
        }
        System.out.println("Расход для легковых авто(C100) составил " + masVes[0][3]);
        System.out.println("Расход для грузовых авто(C200) составил " + masVes[1][3]);
        System.out.println("Расход для посажирских авто(C300) составил " + masVes[2][3]);
        System.out.println("Расход для тяжелой техники (краны)(C400) составил " + masVes[3][3]);
        System.out.println("Общий расход составил " + (masVes[0][3] + masVes[1][3] + masVes[2][3] + masVes[3][3]));
        double minSum = masVes[0][3], maxSum = masVes[0][3];
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < 4; i++){
            if (masVes[i][3] < minSum ){
                minSum = masVes[i][3];
                minIndex = i;
            }
            if (masVes[i][3] > maxSum ){
                maxSum = masVes[i][3];
                maxIndex = i;
            }
        }
        System.out.println("Минимальный расход для модели авто C" + allCar[minIndex].model + " равен " + masVes[minIndex][3]);
        System.out.println("Максимальный расход для модели авто C" + allCar[maxIndex].model + " равен " + masVes[maxIndex][3]);
    }
}
