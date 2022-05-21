package co.com.sofkau.epm.mantenimiento.mantenimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class MantenimientoCreado  extends DomainEvent {

    private final  Set<TallerId> tallerId;
    private final Set<ZonaServicioId> zonaServicioId;
    private final Municipio municipio;

    public MantenimientoCreado(Set<TallerId> tallerId, Set<ZonaServicioId> zonaServicioId, Municipio municipio) {
        super("co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado");
        this.tallerId = tallerId;
        this.zonaServicioId = zonaServicioId;
        this.municipio = municipio;
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
