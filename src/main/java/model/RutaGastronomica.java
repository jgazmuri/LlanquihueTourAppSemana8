package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(String nombre, String duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;

    }

    @Override
    public String toString() {
        return "RutaGastronomica{" + super.toString() + ','+
                "numeroDeParadas=" + numeroDeParadas +
                '}';
    }

}
