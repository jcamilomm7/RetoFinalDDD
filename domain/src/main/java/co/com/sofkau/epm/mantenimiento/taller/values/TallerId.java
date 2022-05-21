package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.Identity;

public class TallerId extends Identity {

    public TallerId(String id) {
        super(id);
    }

    public TallerId() {
    }

    public static TallerId of(String id) {
        return new TallerId(id);
    }
}
