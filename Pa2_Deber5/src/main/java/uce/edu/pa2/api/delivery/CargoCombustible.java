package uce.edu.pa2.api.delivery;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class CargoCombustible implements CargoExtra {

    @Override
    public double aplicar(double valor) {

        System.out.println("Aplicando cargo de combustible");

        return valor + (valor * 0.10);
    }
}