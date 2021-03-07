package Clase_fiinte;

import java.util.Scanner;
import java.io.FileWriter;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Persoana {

    protected String nume;
    protected String email;
    protected String numarTelefon;
    protected int varsta;

    public Persoana() {

        nume=null;
        email=null;
        numarTelefon=null;
        varsta=0;
    }

    public Persoana(String nume, String email, String numarTelefon, int varsta) {
        this.nume = nume;
        this.email = email;
        this.numarTelefon = numarTelefon;
        this.varsta = varsta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        return nume + " , " + email + " , " + numarTelefon + " , "+varsta;
    }



    public void adaugaPersoana() {}



    public void afisarePersoana(){

            String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\srcs\\persoana.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = " ,";


            try {

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] client = line.split(cvsSplitBy);

                    System.out.println("nume " + client[0] + " , email=" + client[1]);

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
//        System.out.println("Nume: "+ this.nume);
//        System.out.println("Email: " +this.email);
//        System.out.println("Numar de telefon: "+this.numarTelefon);
//        System.out.println("Varsta: "+this.varsta);

    }


