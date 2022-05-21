package co.com.sofkau.epm.mantenimiento.zonaservicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

public class CrearZonaServicio extends Command {

    private ZonaServicioId zonaServicioId;
    private Direccion direccion;

    public CrearZonaServicio(ZonaServicioId zonaServicioId, Direccion direccion) {
        this.zonaServicioId = zonaServicioId;
        this.direccion = direccion;
    }

    public ZonaServicioId getZonaServicioId() {
        return zonaServicioId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
