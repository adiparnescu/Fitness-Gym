package Clase_obiecte;

import Clase_fiinte.Client;
import Clase_fiinte.Antrenor;

import java.util.Date;
import java.util.Scanner;

public class Abonament {

    private String tip;
    private int tarif;
//    private String program;
    private String dataInceput;
    private String dataExpirare;
    private Client clientDetinator;
  //  private Clase_fiinte.Antrenor antrenorClient;

    public String toString() {
        return  tip+ " , " + tarif + " , " + dataInceput + " , "+ dataExpirare+ " , " + clientDetinator+ " \n ";
    }
    public Abonament() {

        tip = null;
        tarif = 0;
//        program = null;
        dataExpirare = null;
        dataExpirare = null;
        clientDetinator = null;
       // antrenorClient = null;
    }

    public Abonament(String tip, int tarif, String program, String dataInceput, String dataExpirare, Client clientDetinator, Antrenor antrenorClient) {
        this.tip = tip;
        this.tarif = tarif;
//        this.program = program;
        this.dataInceput = dataInceput;
        this.dataExpirare = dataExpirare;
        this.clientDetinator = clientDetinator;
       // this.antrenorClient = antrenorClient;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

//    public String getProgram() {
//        return program;
//    }
//
//    public void setProgram(String program) {
//        this.program = program;
//    }

    public String getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(String dataInceput) {
        this.dataInceput = dataInceput;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public Client getClientDetinator() {
        return clientDetinator;
    }

    public void setClientDetinator(Client clientDetinator) {
        this.clientDetinator = clientDetinator;
    }

//    public Clase_fiinte.Antrenor getAntrenorClient() {
//        return antrenorClient;
//    }
//
//    public void setAntrenorClient(Clase_fiinte.Antrenor antrenorClient) {
//        this.antrenorClient = antrenorClient;
//    }

    public void creareAbonament(Client a) {
//        private String tip;
//        private int tarif;
//        private String program;
//        private Date dataInceput;
//        private Date dataExpirare;
//        private Clase_fiinte.Client clientDetinator;
//        private Clase_fiinte.Antrenor antrenorClient;
//        Scanner cin = new Scanner(System.in);
//        System.out.println("abonament pentru "+ a.getNume());
//        Scanner cin = new Scanner(System.in);
//        String tip;
//        System.out.println("Clase_obiecte.Abonament silver/platinum/gold? ");
//        tip = cin.nextLine();
//        this.tip = tip;
//        if (tip.equals("gold"))
//            this.tarif = 500;
//        else {
//            if (tip.equals("silver"))
//                this.tarif = 300;
//            else {
//                if (tip.equals("platinum"))
//                    this.tarif = 400;
//            }
//        }
//
//        Date d=null;
//        String ss;
//        cin.nextLine();
//        System.out.println("De cand sa inceapa abonamentul?");
//        ss=cin.nextLine();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//        try {
//            Date da = sdf.parse(ss);
//            this.dataInceput = da;
//        } catch (ParseException e) {
//            e.printStackTrace();
//            this.dataInceput = null;
//        }
//        Date dd=null;
//        String s;
//        cin.nextLine();
//        System.out.println("Pana cand sa fie  abonamentul?");
//        s=cin.nextLine();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
//        try {
//             dd = sdf1.parse(s);
//            this.dataExpirare = dd;
//        } catch (ParseException e) {
//            e.printStackTrace();
//            this.dataExpirare = null;
//        }
//        this.clientDetinator=a;
       // this.antrenorClient=b;
    }


    public void afisAbonament()
    {
//        private int tarif;
//        private String program;
//        private Date dataInceput;
//        private Date dataExpirare;
//        private Clase_fiinte.Client clientDetinator;
//        private Clase_fiinte.Antrenor antrenorClient;
//        Scanner cin = new Scanner(System.in);
        System.out.println("Tip abonament "+this.tip);
        System.out.println("Tarif abonament "+this.tarif);
        System.out.println("Data valabilitate "+this.dataInceput+ " "+this.dataExpirare);
        //System.out.println("Detinator abonament "+this.clientDetinator);

    }
    public void extindereAbonament()
    {
        System.out.println("Abonamentul tau expira pe "+this.getDataExpirare());
        System.out.println("Pana cand vrei sa il prelungesti?");
        Date d=null;
        String ss;
        Scanner cin=new Scanner(System.in);
        cin.nextLine();
        ss=cin.nextLine();
        this.setDataExpirare(ss);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//        try {
//            Date da = sdf.parse(ss);
//            this.setDataExpirare(da);
//        } catch (ParseException e) {
//            e.printStackTrace();
//
//        }
        System.out.println("acum abonamentul tau este valabil pana la "+ this.getDataExpirare());

    }

    public void vizualizareAbonament(Client a,Abonament[] abonamente)
    {
          for(int i=0;i<abonamente.length;i++)
              if (abonamente[i].getClientDetinator().equals(a)) abonamente[i].afisAbonament();


    }
}

