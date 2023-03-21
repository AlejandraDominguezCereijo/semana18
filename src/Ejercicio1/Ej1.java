package Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class Ej1 {
    public String pruebaEjercicio1(String saludo,String ruta){
        boolean completado= true;
        FileWriter escritura;
        try {
            escritura=new FileWriter(ruta);
            escritura.write(saludo);
            escritura.close();
            System.out.print(completado);
        }catch (IOException e){
            System.out.println(e.toString());
            System.out.print(false);
        }

        return "";
    }
}
