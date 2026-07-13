package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(String nombre, String duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;


    }
    @Override
    public void mostrarResumen(){

        System.out.println("El nombre del servicio es: " + nombre);
        System.out.println("Paseo en lugar historico: " + lugarHistorico);
        }

    public void Lugares(){
        System.out.println(getNombre() +" "+ getDuracionHoras() + "Esto dura el Servicio");
    }

    @Override
    public String toString() {
        return "ExcursionCultural{" +
                "lugarHistorico='" + lugarHistorico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", duracionHoras='" + duracionHoras + '\'' +
                '}';
    }
}