package co.com.sofkau.epm.mantenimiento.almacen.values;

import co.com.sofka.domain.generic.Identity;

public class InventarioId extends Identity {

    public InventarioId(String id) {
        super(id);
    }

    public InventarioId() {
    }

    public static InventarioId of(String id){
        return new InventarioId(id);
    }
}
