package Clase_obiecte;

import java.util.Date;

public class Echipamente {


    private String nume;
    private String tip;
    private Date vechime;
    private int numar;

    public Echipamente() {
        nume=null;
        tip=null;
        vechime=null;
        numar=0;
    }

    public Echipamente(String nume, String tip, Date vechime, int numar) {
        this.nume = nume;
        this.tip = tip;
        this.vechime = vechime;
        this.numar = numar;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setVechime(Date vechime) {
        this.vechime = vechime;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getNume() {
        return nume;
    }

    public String getTip() {
        return tip;
    }

    public Date getVechime() {
        return vechime;
    }

    public int getNumar() {
        return numar;
    }
}
