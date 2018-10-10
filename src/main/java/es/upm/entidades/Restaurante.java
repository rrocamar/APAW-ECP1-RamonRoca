package es.upm.entidades;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private String id;

    private String nombre;

    private String direccion;

    private Cocina tipo;

    private List<Empleado> empleados;

    private Carta carta;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();
        this.carta = new Carta();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cocina getTipo() {
        return tipo;
    }

    public void setTipo(Cocina tipo) {
        this.tipo = tipo;
    }
}
