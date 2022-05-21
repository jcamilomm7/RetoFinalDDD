package co.com.sofkau.epm.mantenimiento.almacen.values;

import co.com.sofka.domain.generic.Identity;

public class AlmacenId extends Identity {

    public AlmacenId(String id) {
        super(id);
    }

    public AlmacenId() {
    }

    public static AlmacenId of(String id){
        return new AlmacenId(id);
    }

}
