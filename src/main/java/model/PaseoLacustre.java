package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;


    public PaseoLacustre(String nombre, String duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {

        System.out.printf("\n---Paseo Lacustre---\n");
        super.mostrarInformacion();
        System.out.println("El tipo de Embarcacion es: " + tipoEmbarcacion);
    }

    public void Lacustre(){
        System.out.println(nombre +" "+ duracionHoras + "Adjunto servicio");
    }

}
