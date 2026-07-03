package model;

public class ServicioTuristico {

    protected String nombre;
    protected String duracionHoras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(String duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public ServicioTuristico(String nombre, String duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;

    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("DuracionHoras: " + getDuracionHoras());
    }

}
