package model;

public class ExcursionCultural extends ServicioTuristico {

    private int lugarHistorico;

    public int getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(int lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(String nombre, String duracionHoras, int lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;

    }

    @Override
    public String toString() {
        return "ExcursionCultural{" + super.toString() + ','+
                "lugarHistorico=" + lugarHistorico +
                '}';
    }
}
