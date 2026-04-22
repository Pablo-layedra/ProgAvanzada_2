package uce.edu.pa2.api.contador;

import jakarta.inject.Singleton;

@Singleton
public class GeneradorUnico {

    private int id = 0;

    public int generar() {
        return ++id;
    }
}
