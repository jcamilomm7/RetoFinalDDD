package co.com.sofkau.epm.mantenimiento.zonaservicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

public class AgregarJefeServicio extends Command {

    private ZonaServicioId zonaServicioId;
    private Nombre nombre;

    public AgregarJefeServicio(ZonaServicioId zonaServicioId, Nombre nombre) {
        this.zonaServicioId = zonaServicioId;
        this.nombre = nombre;
    }

    public ZonaServicioId getZonaServicioId() {
        return zonaServicioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
