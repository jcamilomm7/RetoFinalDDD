package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.GuiaRecepcion;
import co.com.sofkau.epm.mantenimiento.taller.Jefetaller;
import co.com.sofkau.epm.mantenimiento.taller.PersonalOperativo;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

import java.util.Set;

public class CrearTaller extends Command {

    private TallerId tallerId;
    private AlmacenId almacenId;

   private  Nombre nombre;


    public CrearTaller(TallerId tallerId, AlmacenId almacenId, Nombre nombre) {
        this.tallerId = tallerId;
        this.almacenId = almacenId;
        this.nombre = nombre;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
