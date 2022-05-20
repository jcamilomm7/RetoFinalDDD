package co.com.sofkau.epm.mantenimiento.zonaservicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.zonaservicio.OrdenServicio;

import java.util.Set;

public class EliminarOrdenServicio extends Command {

    private Set<OrdenServicio> ordenServicio;

    public EliminarOrdenServicio(Set<OrdenServicio> ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    public Set<OrdenServicio> getOrdenServicio() {
        return ordenServicio;
    }
}
