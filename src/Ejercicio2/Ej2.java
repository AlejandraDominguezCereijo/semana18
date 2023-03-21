package Ejercicio2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ej2 {
    public String pruebaEjercicio2(String ruta){
        ArrayList<Character>lista_caracteres=new ArrayList<Character>();
        lista_caracteres.add('P');
        lista_caracteres.add('R');
        lista_caracteres.add('U');
        lista_caracteres.add('E');
        lista_caracteres.add('B');
        lista_caracteres.add('A');

        FileReader lector;
        try{
            lector=new FileReader(ruta);
            int caracter= lector.read();
            while (caracter!=-1){
                char leer= (char) caracter;
                System.out.print(leer);// al poner solo print nos lee el texto en horizontal
                caracter=lector.read();
            }
            System.out.println("");
            lector.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.print("Error al leer el fichero");
        }
        StringBuilder builder=new StringBuilder();
        for (Character c:lista_caracteres){
            builder.append(c);
        }
        textoLeido
        return "";
    }
}
