package Ejercicio3;

import java.io.FileWriter;
import java.io.IOException;

public class Ej3 {
    public String pruebaEjercicio3(String saludo, String ruta,boolean añadir) {
        boolean completado= true;
        FileWriter escritura;

        try {
            escritura = new FileWriter(ruta,false);// al poner el true hacemos que nos añade contenido al archivo, al cambiar a false sobreescribe el contenido
            escritura.write(saludo);
            System.out.print(añadir);
            escritura.close();

        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.print(false);
        }
        return "";
    }
}
