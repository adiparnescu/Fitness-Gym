package servicii;

import Clase_fiinte.Angajat;
import Clase_fiinte.Client;
import Clase_obiecte.Abonament;
import Clase_obiecte.Clasa;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicii_Client {





    public void showClient(Client c)
    {
        c.afisareClient();
    }



    public void showAbonament(Abonament a)
    {
        a.afisAbonament();
    }




    public void showAngajat(Angajat a)
    {
        a.afisareAngajare();
    }



    public void showClasses(ArrayList<Clasa> clase)
    {
        for (int i = 0; i < clase.size(); i++) {
            clase.get(i).afisClasa();
        }

    }

    public void reserveClass(Client c,ArrayList<Clasa> clase)
    {
        System.out.println("La ce curs doresti?");
        Scanner sin=new Scanner(System.in);
        String s;
        s=sin.nextLine();
        for (int i = 0; i < clase.size(); i++) {
            if (clase.get(i).getNume().equals(s)) {
                clase.get(i).rezervareLoc(c);
            }

        }
    }



}
