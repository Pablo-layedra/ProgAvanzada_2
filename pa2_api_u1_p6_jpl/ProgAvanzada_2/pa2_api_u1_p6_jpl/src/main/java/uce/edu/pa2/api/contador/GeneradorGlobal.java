package uce.edu.pa2.api.contador;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GeneradorGlobal {

    private int id = 0;

    public int generar() {
        return ++id;
    }
}
