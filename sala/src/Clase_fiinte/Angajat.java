package Clase_fiinte;

import Clase_fiinte.Persoana;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Angajat extends Persoana {

    private String postAngajat;
    private int salariu;
    private Date dataAngajare;

    public Angajat() {

        postAngajat = null;
        salariu=0;
        dataAngajare=null;
    }

    public String getPostAngajat() {
        return postAngajat;
    }

    public void setPostAngajat(String postAngajat) {
        this.postAngajat = postAngajat;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Date getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }


    public  void adaugaAngajat()
    {
        super.adaugaPersoana();
        Scanner cin = new Scanner(System.in);

        String post;
        System.out.println("Ce post ocupa acest angajat? ");
        post = cin.nextLine();
        this.postAngajat=post;

        int sal;
        System.out.println("Ce salariu are acest angajat?");
        sal = cin.nextInt();
        this.salariu=sal;


        Date d=null;
        String ss;
        cin.nextLine();
        System.out.println("Care este data de angajare?");
        ss=cin.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date da = sdf.parse(ss);
            this.dataAngajare = da;
        } catch (ParseException e) {
            e.printStackTrace();
            this.dataAngajare = null;
        }


    }
    public void afisareAngajare()
    {
        //super.afisarePersoana();
        System.out.println("Post: "+ this.postAngajat);
        System.out.println("Salariu : " +this.salariu +"lei");
        System.out.println("Data angajare: "+this.dataAngajare);
    }
}
