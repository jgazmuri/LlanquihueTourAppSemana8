package model;

public class PaseoLacustre extends ServicioTuristico {

    private int tipoEmbarcacion;

    public int getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(int tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacustre(String nombre, String duracionHoras, int tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;

    }

    @Override
    public String toString() {
        return  "PaseoLacustre{" + super.toString() + "," +
                "tipoEmbarcacion=" + tipoEmbarcacion +
                '}';
    }
}
