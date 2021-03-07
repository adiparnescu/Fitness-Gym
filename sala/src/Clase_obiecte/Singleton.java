package Clase_obiecte;

public class Singleton {

    private static Singleton path = null;


    private static final String s = "C:\\Users\\aadri\\Desktop\\Facultate\\ANUL 2\\Sem 2\\PAO\\Proiect Sala de Fitness\\sala\\apeluri_functii.txt";

    // private constructor restricted to this class itself
    private Singleton() {
    }

    // static method to create instance of Clase_obiecte.Singleton class
    public static Singleton getInstance() {
        if (path == null)
            path = new Singleton();

        return path;
    }

    public String getPath(){return s;}
}
