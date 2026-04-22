package uce.edu.pa2.api.contador;

import jakarta.enterprise.context.Dependent;

@Dependent
public class GeneradorTemporal {

    private int id = 0;

    public int generar() {
        return ++id;
    }
}