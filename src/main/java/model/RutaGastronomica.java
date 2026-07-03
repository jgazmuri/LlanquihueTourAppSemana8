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
        public void mostrarInformacion(){
        System.out.printf("\n---Ruta Gastronomica---\n");
        super.mostrarInformacion();
        System.out.println("El numero de paradas es: " + numeroDeParadas);;

    }
    private void gastro(){
        System.out.printf(nombre +" "+ duracionHoras + "estas son las rutas");
    }

}
