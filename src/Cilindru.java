public class Cilindru {

    private double raza;
    private double inaltime;

    public Cilindru (double raza, double inaltimea){
        this.raza =raza;
        this.inaltime = inaltimea;
    }

    public double calculeazaSuprafata(){
        return 2* Math.PI*raza*(raza+inaltime);

    }
    public double calculeazaVolumul(){
        return Math.PI*Math.pow(raza,2)*inaltime;
    }

    public String toString(){
        return "cilindrul cu raza "+raza + " si " +inaltime;
    }

}
