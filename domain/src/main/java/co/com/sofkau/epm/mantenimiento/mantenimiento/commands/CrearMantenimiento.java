package co.com.sofkau.epm.mantenimiento.mantenimiento.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class CrearMantenimiento extends Command {

    private MantenimientoId mantenimientoId;
    private TallerId tallerId;
    private ZonaServicioId zonaServicioId;
    private Municipio municipio;


    public CrearMantenimiento(MantenimientoId mantenimientoId, TallerId tallerId, ZonaServicioId zonaServicioId, Municipio municipio) {
        this.mantenimientoId = mantenimientoId;
        this.tallerId = tallerId;
        this.zonaServicioId = zonaServicioId;
        this.municipio = municipio;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public ZonaServicioId getZonaServicioId() {
        return zonaServicioId;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
