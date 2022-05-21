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
    private Set<TallerId> tallerId;
    private Set<ZonaServicioId> zonaServicioId;
    private Municipio municipio;

    public CrearMantenimiento(MantenimientoId mantenimientoId, Set<TallerId> tallerId, Set<ZonaServicioId> zonaServicioId, Municipio municipio) {
        this.mantenimientoId = mantenimientoId;
        this.tallerId = tallerId;
        this.zonaServicioId = zonaServicioId;
        this.municipio = municipio;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public Set<TallerId> getTallerId() {
        return tallerId;
    }

    public Set<ZonaServicioId> getZonaServicioId() {
        return zonaServicioId;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
