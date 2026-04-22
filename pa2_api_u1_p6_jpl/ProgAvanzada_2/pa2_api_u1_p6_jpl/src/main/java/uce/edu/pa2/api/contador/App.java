package uce.edu.pa2.api.contador;

import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import uce.edu.pa2.api.contador.ControlTurnos;
import uce.edu.pa2.api.contador.GeneradorGlobal;
import uce.edu.pa2.api.contador.GeneradorTemporal;
import uce.edu.pa2.api.contador.GeneradorUnico;

public class App implements QuarkusApplication{

    @Inject
    private GeneradorGlobal global;

    @Inject
    private GeneradorTemporal temporal;

    @Inject
    private GeneradorUnico unico;

    @Inject
    private ControlTurnos control;

    @Override
    public int run(String... args) {

        System.out.println("=================================");
        System.out.println("   APPLICATION SCOPED (GLOBAL)");
        System.out.println("=================================");

        System.out.println("Instancia: " + global);
        System.out.println(global.generar());
        System.out.println(global.generar());
        System.out.println(global.generar());

        System.out.println("\nDesde clase intermedia:");
        control.probarGlobal();

        // -----------------------------

        System.out.println("\n=================================");
        System.out.println("        DEPENDENT");
        System.out.println("=================================");

        System.out.println("Instancia: " + temporal);
        System.out.println(temporal.generar());
        System.out.println(temporal.generar());
        System.out.println(temporal.generar());

        System.out.println("\nDesde clase intermedia:");
        control.probarTemporal();

        // -----------------------------

        System.out.println("\n=================================");
        System.out.println("         SINGLETON");
        System.out.println("=================================");

        System.out.println("Instancia: " + unico);
        System.out.println(unico.generar());
        System.out.println(unico.generar());
        System.out.println(unico.generar());

        System.out.println("\nDesde clase intermedia:");
        control.probarSingleton();

        return 0;
    }
    
}
