public class ClassCar {

    public int model, km, pBigAvto;
    public String gosNum;

    public ClassCar() {
    }

    ClassCar(int model, String gosNum, int km){
        this.model = model;
        this.gosNum = gosNum;
        this.km = km;
    }
    ClassCar(int model, String gosNum, int km, int pBigAvto){
        this.model = model;
        this.gosNum = gosNum;
        this.km = km;
        this.pBigAvto = pBigAvto;
    }

}
