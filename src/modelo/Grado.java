package modelo;

public class Grado {

    private int id;
    private String nombre;

    public Grado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Grado() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
