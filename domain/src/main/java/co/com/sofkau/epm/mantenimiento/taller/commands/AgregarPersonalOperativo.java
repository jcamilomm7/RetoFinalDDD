package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.taller.values.HabilidadTecnica;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarPersonalOperativo extends Command {

    private TallerId tallerId;
    private Nombre nombre;
    private HabilidadTecnica habilidadTecnica;

    public AgregarPersonalOperativo(TallerId tallerId, Nombre nombre, HabilidadTecnica habilidadTecnica) {
        this.tallerId = tallerId;
        this.nombre = nombre;
        this.habilidadTecnica = habilidadTecnica;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public HabilidadTecnica getHabilidadTecnica() {
        return habilidadTecnica;
    }
}
