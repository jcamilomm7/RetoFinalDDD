package co.com.sofkau.epm.mantenimiento.almacen.values;

import co.com.sofka.domain.generic.Identity;

public class ProveedorId extends Identity {
    public ProveedorId(String id) {
        super(id);
    }

    public ProveedorId() {
    }

    public static ProveedorId of(String id){
        return new ProveedorId(id);
    }

}
