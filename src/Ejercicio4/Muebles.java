package Ejercicio4;

import java.io.Serializable;
import java.util.ArrayList;

public class Muebles implements Serializable {
    private String tipoMueble = "";

    public Muebles() {
    }

    public Muebles(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public String getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "tipoMueble='" + tipoMueble + '\'' +
                '}';
    }
}
