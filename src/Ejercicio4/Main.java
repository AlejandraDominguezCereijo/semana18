package Ejercicio4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Muebles _muebles=new Muebles("mesa");
        Ej4 _ej4=new Ej4();
        _ej4.pruebaEjercicio4(_muebles,"C:\\www\\prog\\semana18\\src\\Ejercicio4\\ejercicio4.txt",true);

    }
}
