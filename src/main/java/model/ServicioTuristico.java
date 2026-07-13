package model;

public class ServicioTuristico implements Registrable{

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

public void mostrarResumen() {

    System.out.println("Nombre: " + nombre);
    System.out.println("Duracion horas: " + duracionHoras);

}

    @Override
    public String toString() {
        return "ServicioTuristico{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras='" + duracionHoras + '\'' +
                '}';
    }
}
