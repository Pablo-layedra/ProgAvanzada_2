package uce.edu.pa2.api.contador;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ControlTurnos {

    @Inject
    private GeneradorGlobal generadorGlobal;

    @Inject
    private GeneradorTemporal generadorTemporal;

    @Inject
    private GeneradorUnico generadorUnico;

    public void probarGlobal() {
        System.out.println("GLOBAL -> " + generadorGlobal);
        System.out.println(generadorGlobal.generar());
    }

    public void probarTemporal() {
        System.out.println("DEPENDENT -> " + generadorTemporal);
        System.out.println(generadorTemporal.generar());
    }

    public void probarSingleton() {
        System.out.println("SINGLETON -> " + generadorUnico);
        System.out.println(generadorUnico.generar());
    }
}
