package Clase_fiinte;

import java.io.*;
import java.util.Scanner;


public class Client extends Persoana {

    private String tipMembru;

    public Client() {
        tipMembru = null;
    }

    public Client(String nume, String email, String nrtel, int varsta, String tipMembru) {
        super(nume, email, nrtel, varsta);
        this.tipMembru = tipMembru;
    }


    public String getTipMembru() {
        return tipMembru;
    }

    public void setTipMembru(String tipMembru) {
        this.tipMembru = tipMembru;
    }

    public String toString() {
        return  nume+ " , " + email + " , " + numarTelefon + " , "+ varsta+ " , " + tipMembru + " \n ";
    }

    public void adaugaClient() {
        super.adaugaPersoana();
        System.out.println("Ce tip de client e?");
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        this.tipMembru = s;
        try {
            FileWriter fw = new FileWriter("C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\client.txt");
            fw.write(this.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void afisareClient() {
        super.afisarePersoana();
//        System.out.println("Clase_fiinte.Client :" + this.tipMembru);

        String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\client.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " ,";


        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] client = line.split(cvsSplitBy);

                System.out.println("tip client: "+ client[4]);

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
    }

