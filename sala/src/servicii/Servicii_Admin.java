package servicii;
import Clase_obiecte.Singleton;
import Clase_fiinte.Angajat;
import Clase_fiinte.Antrenor;
import Clase_fiinte.Client;
import Clase_obiecte.Abonament;
import Clase_obiecte.Clasa;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Servicii_Admin {


    public ArrayList<Clase_fiinte.Client>  incarcaClienti()
    {

        String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\client.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " , ";

        ArrayList<Clase_fiinte.Client>  clienti=new ArrayList<Clase_fiinte.Client>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            //line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] client=line.split(cvsSplitBy);

                Client c=new Client();
                c.setNume(client[0]);
                c.setEmail(client[1]);
                c.setNumarTelefon(client[2]);
                int x;
                x=Integer.parseInt(client[3]);
                c.setVarsta(x);
                c.setTipMembru(client[4]);
                clienti.add(c);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e )
        { e.printStackTrace();}
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("incarcaClienti , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
            ///mut asta in singleton si ii dau mesajul ca parametru
        }
        catch(Exception e){ System.out.println(e);}
        return clienti;

    }

    public Client addClient(ArrayList<Client> cl)
    {
        Client c=new Client();
        Scanner cin = new Scanner(System.in);
        String nume;
        System.out.println("Insereaza nume");
        nume = cin.nextLine();
        c.setNume(nume);
        // fw.write(nume+ "    ");
        String em;
        System.out.println("Insereaza email");
        em = cin.nextLine();
        c.setEmail(em);
        //fw.write(email+ "    ");
        //Scanner cin = new Scanner(System.in);
        String nrtel;
        System.out.println("Insereaza numar de telefon");
        nrtel = cin.nextLine();
        c.setNumarTelefon(nrtel);
        //fw.write(numarTelefon+ "    ");
        int v;
        System.out.println("Insereaza varsta");
        v = cin.nextInt();
        c.setVarsta(v);
        String s;
        System.out.println("Ce tip de client e?");
        cin.nextLine();
        s = cin.nextLine();
        c.setTipMembru(s);
        cl.add(c);
        try{
            FileWriter fw = new FileWriter("C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\client.txt",true);
            fw.write(c.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("addClient , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }
        catch(Exception e){ System.out.println(e);}
        return c;
    }

    private void addAbonament(ArrayList<Clase_fiinte.Client> cl)
    {
        Abonament a=new Abonament();
        Client c=addClient(cl);
        Scanner cin = new Scanner(System.in);
        String tip;
        System.out.println("Clase_obiecte.Abonament silver/platinum/gold? ");
        tip = cin.nextLine();
        a.setTip(tip);
        if (tip.equals("gold"))
            a.setTarif(500);
        else {
            if (tip.equals("silver"))
                a.setTarif(300);
            else {
                if (tip.equals("platinum"))
                    a.setTarif(400);
            }
        }

        Date d=null;
        String ss;
        cin.nextLine();
        System.out.println("De cand sa inceapa abonamentul?");
        ss=cin.nextLine();
        a.setDataInceput(ss);
        String s;
        cin.nextLine();
        System.out.println("Pana cand sa fie  abonamentul?");
        s=cin.nextLine();
        a.setDataExpirare(s);
        a.setClientDetinator(c);
        try{
            FileWriter fw = new FileWriter("C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\abonamente.txt",true);
            fw.write(a.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("createAbonament , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }
        catch(Exception e){ System.out.println(e);}
    }

    public void extendAbonament(Abonament a)
    {
        a.extindereAbonament();
    }

    public void showClient()
    {
        String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\client.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " ,";


        try {

            br = new BufferedReader(new FileReader(csvFile));
           // line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] client=line.split(cvsSplitBy);
                String l=client[0];
                System.out.println("nume " + client[0] + " , email " + client[1] + " nr tel "+client[2]+ " varsta " + client[3]+" tip client"+ client[4]);

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






    public ArrayList<Abonament> incarcaAbonamente()
    {
        String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\abonamente.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " , ";

        ArrayList<Clase_obiecte.Abonament>  abonamente=new ArrayList<Abonament>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            //line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] abonament=line.split(cvsSplitBy);
                Abonament a=new Abonament();
                a.setTip(abonament[0]);
                int x=Integer.parseInt(abonament[1]);
                a.setTarif(x);
                a.setDataInceput(abonament[2]);
                a.setDataExpirare(abonament[3]);
                Client c=new Client();
                c.setNume(abonament[4]);
                c.setEmail(abonament[5]);
                c.setNumarTelefon(abonament[6]);
                int z=Integer.parseInt(abonament[7]);
                c.setVarsta(z);
                c.setTipMembru(abonament[8]);
                a.setClientDetinator(c);
                abonamente.add(a);

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

        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("incarcaAbonamente , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }
        catch(Exception e){ System.out.println(e);}
        return abonamente;
    }



    public void addAngajat(ArrayList<Angajat> angajati)
    {
        Angajat a=new Angajat();
        a.adaugaAngajat();
        angajati.add(a);
    }

    public Clasa addClass(ArrayList<Clase_obiecte.Clasa> clase)
    {
        Clasa cl=new Clasa();
        Antrenor a=new Antrenor();
        Scanner cin = new Scanner(System.in);
        System.out.println("Ce clasa vrei sa adaugi?");
        String c;
        c = cin.nextLine();
        cl.setNume(c);
        cl.setProfesor(a);
        System.out.println("Cate locuri disponibile sunt?");
        int x;
        x = cin.nextInt();
        cl.setNumarLocuri(x);
        c=cin.nextLine();
        System.out.println("Unde se tine clasa?");
        c = cin.nextLine();
        cl.setSala(c);
        System.out.println("Cand se tine clasa?");
        c = cin.nextLine();
        cl.setProgram(c);
        clase.add(cl);
        try{
            FileWriter fw = new FileWriter("C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\clase.txt",true);
            fw.write(cl.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}
        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("addClass , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }
        catch(Exception e){ System.out.println(e);}
        return cl;

    }

    public void addAntrenor()
    {
        Antrenor c=new Antrenor();
        Scanner cin = new Scanner(System.in);
        String nume;
        System.out.println("Insereaza nume");
        nume = cin.nextLine();
        c.setNume(nume);
        // fw.write(nume+ "    ");
        String em;
        System.out.println("Insereaza email");
        em = cin.nextLine();
        c.setEmail(em);
        //fw.write(email+ "    ");
        //Scanner cin = new Scanner(System.in);
        String nrtel;
        System.out.println("Insereaza numar de telefon");
        nrtel = cin.nextLine();
        c.setNumarTelefon(nrtel);
        //fw.write(numarTelefon+ "    ");
        int v;
        System.out.println("Insereaza varsta");
        v = cin.nextInt();
        c.setVarsta(v);
        System.out.println("Ce tarif are pe ora?");
        cin.nextLine();
        int s = cin.nextInt();
        c.setTarifOra(s);
        try{
            FileWriter fw = new FileWriter("C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\antrenori.txt",true);
            fw.write(c.toString());
            fw.close();}
        catch(Exception e){ System.out.println(e);}


    }


    public ArrayList<Antrenor> incarcaAntrenori()
    {
        String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\antrenori.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " ,";

        ArrayList<Clase_fiinte.Antrenor>  antrenori=new ArrayList<Antrenor>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                String[] antrenor=line.split(cvsSplitBy);
                Antrenor a=new Antrenor();
                a.setNume(antrenor[0]);
                a.setEmail(antrenor[1]);
                a.setNumarTelefon(antrenor[2]);
                int v=Integer.parseInt(antrenor[3]);
                a.setVarsta(v);
                int t=Integer.parseInt(antrenor[4]);
                a.setTarifOra(t);
                antrenori.add(a);
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
        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("incarcaAntrenori , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }catch(Exception e){ System.out.println(e);}
        return antrenori;


    }
    public ArrayList<Clasa> incarcaClase()
    {
        String csvFile = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\clase.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        ArrayList<Clase_obiecte.Clasa>  clase=new ArrayList<Clasa>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            line=br.readLine();
            while ((line = br.readLine()) != null  && !line.equals(" ")) {

                // use comma as separator
                String[] clasa=line.split(cvsSplitBy);
                Clasa a=new Clasa();
                a.setNume(clasa[0]);
                //a.setProfesor(clasa[1]);
                int x=Integer.parseInt(clasa[2]);
                a.setNumarLocuri(x);
                a.setSala(clasa[3]);
                a.setProgram(clasa[4]);
                clase.add(a);

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

        try{

            FileWriter fv = new FileWriter(Singleton.getInstance().getPath(),true);
            fv.write("incarcaClase , "+ (new Date()).toString() + System.lineSeparator());
            fv.close();
        }
        catch(Exception e){ System.out.println(e);}
        return clase;
    }

}
