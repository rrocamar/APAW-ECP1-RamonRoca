package es.upm.entidades.composite;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCompuesto extends RestauranteComponente {

    private String nombre;

    private List<RestauranteComponente> componentes;

    public EmpleadoCompuesto(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void remove(RestauranteComponente componente) {
        this.componentes.remove(componente);

    }

    @Override
    public void add(RestauranteComponente componente) {
        this.componentes.add(componente);
    }

    @Override
    public boolean isComponente() {
        return true;
    }

    @Override
    public String view() {
        return nombre;
    }

    @Override
    public double getCoste() {
        double costeTotal = 0;
        for (RestauranteComponente componente : componentes)
            costeTotal += componente.getCoste();
        return costeTotal;
    }
}
