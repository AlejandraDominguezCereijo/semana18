package Ejercicio7;

import Ejercicio4.Muebles;
import Ejercicio6.Ej6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ej7 extends Ej6 {
    public Ej7() {
    }
    public Ej7(ArrayList<Ej6> lista_objetos) {
        super(lista_objetos);
    }

    public Ej7(String nombre, ArrayList<Ej6> lista_objetos) {
        super(nombre, lista_objetos);
    }

        ArrayList<Ej6> lista_objetos = new ArrayList<Ej6>();





    public String pruebaEjercicio7(String ruta, ArrayList<Ej6> objetos) {

            FileInputStream lecturaBytes;
            ObjectInputStream lecturaObjeto;
            Ej6 _ej6;
            try {
                lecturaBytes = new FileInputStream(ruta);
                lecturaObjeto = new ObjectInputStream(lecturaBytes);
                lista_objetos = (ArrayList) lecturaObjeto.readObject();
                System.out.println(lista_objetos.toString());
                lecturaObjeto.close();
                lecturaBytes.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }


        return "";
    }
}
