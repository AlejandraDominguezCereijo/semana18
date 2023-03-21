package Ejercicio4;

import java.io.*;
import java.util.ArrayList;

public class Ej4  extends Muebles{

    public Ej4() {
    }
    public String pruebaEjercicio4( Object objeto, String ruta, boolean añadir){


        FileOutputStream escrituraBytes;
        ObjectOutputStream escrituraObjeto;

        try{
            escrituraBytes=new FileOutputStream(ruta,true);
            escrituraObjeto=new ObjectOutputStream(escrituraBytes);
            escrituraObjeto.writeObject(objeto);
            escrituraObjeto.close();
            escrituraBytes.close();

        }catch (IOException e){
            e.printStackTrace();
        }


        return "";
    }
}
