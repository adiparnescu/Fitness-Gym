package Clase_obiecte;

public class Locatii {

    private String nume;
    private String adresa;
    private String tipMax; //daca tipul maxim e gold,atunci la sala aia poti sa ai abonament silver platinum sau gold..

    public Locatii() {

        nume=null;
        adresa=null;
        tipMax=null;
    }

    public Locatii(String nume, String adresa, String tipMax) {
        this.nume = nume;
        this.adresa = adresa;
        this.tipMax = tipMax;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTipMax() {
        return tipMax;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setTipMax(String tipMax) {
        this.tipMax = tipMax;
    }
}
