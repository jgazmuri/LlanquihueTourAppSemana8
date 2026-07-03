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
    public void mostrarInformacion() {
        System.out.printf("\n---Excurciones Culturales---\n");
        super.mostrarInformacion();
        System.out.println("Lugar a Visitar: " + lugarHistorico);
        ;
    }

    public void Lugares(){
        System.out.println(getNombre() +" "+ getDuracionHoras() + "Esto dura este Servicio");
    }

}