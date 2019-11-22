public class ClassInt {

    private int[] masInt;
    private int nElement;

    public ClassInt(int[] masInt) {
        this.masInt = masInt;
        nElement = masInt.length;
    }

    public void addIntToEnd(int element){
        int[] masNewInt = new int[nElement + 1];
        for (int i = 0; i < masInt.length; i ++){
            masNewInt[i] = masInt[i];
        }
            masNewInt[nElement] = element;
            nElement ++;
            masInt = masNewInt;

    }

    public void addIntToPosition(int element, int position){
        int[] masNewInt = new int[nElement + 1];
        if (position <= masInt.length) {
            nElement++;
            for (int i = 0; i < masInt.length; i++) {
                if (i < position) {
                    masNewInt[i] = masInt[i];
                } else if (i == position) {
                    masNewInt[i] = element;
                    masNewInt[i + 1] = masInt[i];
                } else {
                    masNewInt[i + 1] = masInt[i];
                }
            }
            masInt = masNewInt;
        }
    }

    public void delIntInPosition(int position){
        int[] masNewInt = new int[nElement - 1];
        if (position <= masInt.length) {
            nElement--;
            for (int i = 0; i < masInt.length; i++) {
                if (i < position) {
                    masNewInt[i] = masInt[i];
                } else if (i >= position && i < nElement) {
                    masNewInt[i] = masInt[i+1];
                }
            }
            masInt = masNewInt;
        }
    }

    public void replaceIntInPosition(int element, int position){
        if (position <= masInt.length) {
            masInt[position] = element;
        }
    }

    public void show(){
        for (int i = 0; i < masInt.length; i ++) {
            System.out.print(masInt[i] + " ");
        }
        System.out.println(" Число элементов " + nElement);
    }

    public void sortInt(String how) {
        int temp;
        int[] masSortInt = masInt.clone();
        for (int i = 0; i < masSortInt.length; i++) {
            for (int j = i + 1; j < masSortInt.length; j++) {
                if (masSortInt [j] < masSortInt[i] && how.equals("max") || masSortInt [j] > masSortInt[i] && how.equals("min")){
                    temp = masSortInt[i];
                    masSortInt[i] = masSortInt[j];
                    masSortInt[j] = temp;
                }
            }
        }
        System.out.println("Массив отсортирован по " + how);
        for (int i = 0; i < masSortInt.length; i++) {
            System.out.print(masSortInt[i] + " ");
        }
        System.out.println();
    }

    public int findInt(String what) {
        int temp = masInt[0];
        for (int i = 1; i < masInt.length; i++) {
            if (temp < masInt[i] && what.equals("max")) {
                   temp = masInt[i];
                }
            else if (temp > masInt[i] && what.equals("min")) {
                temp = masInt[i];
            }
        }
        return temp;
    }

    public void replaceAllInt(int element){
        for (int i = 0; i < masInt.length; i ++){
            masInt[i] = element;
        }
    }


}
