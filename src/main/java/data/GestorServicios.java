package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {


    public void mostrarTodosLosServicios(){



        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new ServicioTuristico("Volcan", "4 Horas"));
        servicios.add(new PaseoLacustre("Paseo Frutillar", "2 Horas", "Bus"));
        servicios.add(new ExcursionCultural("Museo Villarrica", "3 Horas", "Plaza Principal"));
        servicios.add(new RutaGastronomica("El Guaton", "1 Hora", 5));

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

        }

    }


}
