package co.com.sofkau.epm.mantenimiento.mantenimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class MantenimientoCreado  extends DomainEvent {

    private final  TallerId tallerId;
    private final ZonaServicioId zonaServicioId;
    private final Municipio municipio;

    public MantenimientoCreado(TallerId tallerId, ZonaServicioId zonaServicioId, Municipio municipio) {
        super("co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado");
        this.tallerId = tallerId;
        this.zonaServicioId = zonaServicioId;
        this.municipio = municipio;
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
