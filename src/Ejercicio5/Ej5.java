package Ejercicio5;

import Ejercicio4.Muebles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej5 extends Muebles {
    public Ej5() {
    }

    public String pruebaEjercicio5(String ruta, Object objeto) {

        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjeto;
        Muebles _muebles;
        try {
            lecturaBytes = new FileInputStream(ruta);
            lecturaObjeto = new ObjectInputStream(lecturaBytes);
            _muebles = (Muebles) lecturaObjeto.readObject();
            System.out.println(_muebles.toString());
            lecturaObjeto.close();
            lecturaBytes.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }

}
