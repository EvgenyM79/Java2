public class Main {

    public static double calkulator(String stroka){
        String[] masForCalk = stroka.split(" ");
        int num = masForCalk.length;
        byte[] howCalk = new byte[num]; // массив, который показывает, очередь вычислений.
        double[] forLong = new double[num]; // массив целых чисел
        for (int i = 0; i < num; i += 2 ){
            forLong[i] = Long.valueOf(masForCalk[i]);
        }
        for (int i = 1; i < num; i += 2 ){
            if (masForCalk[i].equals("*")  || masForCalk[i].equals("/")) {
                howCalk[i] = 1;
            }
            else {
                howCalk[i] = 2;
            }
        }
        for (int i = 1; i < num; i +=2 ) {
            if (howCalk[i] == 1) {
                if (masForCalk[i].equals("*")) {
                    forLong[i + 1] = forLong[i - 1] * forLong[i + 1];
                    forLong[i - 1] = 0;
                    //howCalk[i] = 0;
                }
                if (masForCalk[i].equals("/")) {
                    forLong[i + 1] = forLong[i - 1] / forLong[i + 1];
                    forLong[i - 1] = 0;
                    //howCalk[i] = 0;
                }
            }
        }
        for (int i = 1; i < num; i +=2 ){
            if (howCalk[i] == 2 && masForCalk[i].equals("+")) {
                for (int j = i; j < num; j += 2) {
                    if (forLong[j + 1] != 0){
                        forLong[j + 1] = forLong[i - 1] + forLong[j + 1];
                        //forLong[i - 1] = 0;
                        //howCalk[i] = 0;
                        break;
                    }
                }
            }
            if (howCalk[i] == 2 && masForCalk[i].equals("-")) {
                for (int j = i; j < num; j += 2) {
                    if (forLong[j + 1] != 0){
                        forLong[j + 1] = forLong[i - 1] - forLong[j + 1];
                        //forLong[i - 1] = 0;
                        //howCalk[i] = 0;
                        break;
                    }
                }
            }
        }
        return forLong[num-1];
    }

    public static void main(String[] args) {
        String[] newStroka = new String[9];
        newStroka[0] = "25 + 8 * 5 * 3 / 4 - 4 * 2 / 8";
        newStroka[1] = "32 + 3 * 5 * 3 / 4 - 40 * 2 / 2";
        newStroka[2] = "34 + 2 * 5 * 3 / 2 - 10 * 2 / 4";
        newStroka[3] = "67 + 8 * 2 * 3 / 4 - 32 * 2 / 4";
        newStroka[4] = "87 + 8 * 5 * 3 / 4 - 54 * 2 / 9";
        newStroka[5] = "25 + 4 * 5 * 3 / 4 - 68 * 2 / 4";
        newStroka[6] = "54 + 8 * 5 * 3 / 4 - 78 * 2 / 7";
        newStroka[7]= "47 + 8 * 5 * 3 / 4 - 6 * 2 / 3";
        newStroka[8]= "35 + 8 * 5 * 3 / 4 - 8 * 2 / 8";
        Calc[] newCalc = new Calc[9];
        for (int i = 0; i < 9; i ++ ) {
            System.out.print (newStroka[i]);
            newCalc[i] = new Calc(calkulator(newStroka[i]));
            System.out.println(" [" + i + "] = " + newCalc[i].resultCalc);
        }

        newStroka[0] = "27 + 8 * 5 * 3 / 4 ";
        System.out.println("10 пример  " + newStroka[0] + "[0] = " + calkulator(newStroka[0]));
        for (int j = 8; j > 0; j-- ) {
            newCalc[j].resultCalc = newCalc[j-1].resultCalc;
            System.out.print(newCalc[j].resultCalc + " ");
        }
        newCalc[0] = new Calc(calkulator(newStroka[0]));
        System.out.println();
        for (int i = 0; i < 9; i ++ ) {
            System.out.print(newCalc[i].resultCalc + "  ");
        }
    }
}