package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.Identity;

public class JefetallerId extends Identity {

    public JefetallerId(String id) {
        super(id);
    }

    public JefetallerId() {
    }

    public static JefetallerId of(String id) {
        return new JefetallerId(id);
    }
}
