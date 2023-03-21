package Ejercicio6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ej6 implements Serializable {
    String nombre;
    ArrayList<Ej6> lista_objetos = new ArrayList<Ej6>();
    final int MAX_INT = 3;

    public Ej6(String nombre, ArrayList<Ej6> lista_objetos) {
        this.nombre = nombre;
        this.lista_objetos = lista_objetos;
    }

    public int getMAX_INT() {
        return MAX_INT;
    }

    public Ej6() {
    }

    public Ej6(ArrayList<Ej6> lista_objetos) {
        this.lista_objetos = lista_objetos;
    }

    public ArrayList<Ej6> getLista_objetos() {
        return lista_objetos;
    }

    public void setLista_objetos(ArrayList<Ej6> lista_objetos) {
        this.lista_objetos = lista_objetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ej6> pruebaEjercicio6(ArrayList<Ej6> lista_objetos, String ruta, boolean añadir) {
        String[] array_objetos = {"Mesa", "Silla", "Sofa"};
        for (int i = 0; i < array_objetos.length; i++) {
            Ej6 _ej6 = new Ej6();
            lista_objetos.add(_ej6);
            lista_objetos.get(i).setNombre(array_objetos[i]);
            System.out.println("Posicion "+i+", "+lista_objetos.get(i).getNombre());

        }
        FileOutputStream escrituraBytes;
        ObjectOutputStream escrituraObjeto;
        try {
            escrituraBytes = new FileOutputStream(ruta, true);
            escrituraObjeto = new ObjectOutputStream(escrituraBytes);
            escrituraObjeto.writeObject(lista_objetos);
            escrituraObjeto.close();
            escrituraBytes.close();
            System.out.println("Objetos añadidos correctamente");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al añadir los objetos");
        }

        return lista_objetos;
    }

    @Override
    public String toString() {
        return "Ej6{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
