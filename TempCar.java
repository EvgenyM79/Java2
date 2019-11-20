public class TempCar {


    public int model, km, pBigAvto;
    public String gosNum;
    public double prkm, cena;

    public TempCar(int model, String gosNum, int km, double prkm, double cena, int pBigAvto){
        this.model = model;
        this.gosNum = gosNum;
        this.km = km;
        this.prkm = prkm;
        this.cena = cena;
        this.pBigAvto = pBigAvto;
        /*if (this.pBigAvto > 0) {
            this.pBigAvto = pBigAvto;
        }*/
    }
}
