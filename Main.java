public class Main {

    //public double[][] masVes = new double[][]{{100, 12.5, 46.10, 0}, {200, 12, 48.90, 0}, {300, 11.5, 47.50, 0},{400, 20, 48.90, 0}};

    public static void main(String[] args) {
        String[] masCar = new String[]{"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20",
                "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        double[][] masVes = new double[][]{{100, 12.5, 46.10, 0}, {200, 12, 48.90, 0}, {300, 11.5, 47.50, 0},{400, 20, 48.90, 0}};
        ClassCar[] allCar = new ClassCar[masCar.length]; // массив машин с параметрами (например объект с индексом 1: {200,"1", 120, 1200}
        String[] masParCar = masCar[0].substring(1).split("[-_]+"); //Инициализация переменной для разложение (например "200_1-120-1200) на все параметры одной машины
        //String[] masParCar = masCar[0].replaceFirst("C", "").split("[-_]+" ); - возможно этот вариант правильнее

        for (int i = 0; i < masCar.length; i++) {
            masParCar = masCar[i].split("[-_]+");
            if (masParCar.length == 3) {
                allCar[i] = new ClassCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1], Integer.parseInt(masParCar[2]));
                //System.out.println(allCar[i].model + " " + allCar[i].gosNum + " " + allCar[i].km + " длина " + masParCar.length);
            } else {
                allCar[i] = new ClassCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1], Integer.parseInt(masParCar[2]), Integer.parseInt(masParCar[3]));
                //System.out.println(allCar[i].model + " " + allCar[i].gosNum + " " + allCar[i].km + " " + allCar[i].pBigAvto + " длина " + masParCar.length);
            }
        }
        ClassCalc.calAll(allCar, masVes);
    }
}



