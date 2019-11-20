public class ClassCar {

    public int model, km, pBigAvto;
    public String gosNum;

    /*ClassCar(TempCar[] tempAllCar) {
        this.model = tempAllCar[0].model;
    }*/

    ClassCar(TempCar tempCar){
        this.model = tempCar.model;
        this.gosNum = tempCar.gosNum;
        this.km = tempCar.km;
        //this.km = km;
        this.pBigAvto = tempCar.pBigAvto;
        /*if (tempCar.pBigAvto > 0) {
            this.pBigAvto = tempCar.pBigAvto;
        }*/
    }
}
