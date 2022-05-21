package co.com.sofkau.epm.mantenimiento.mantenimiento.values;

import co.com.sofka.domain.generic.Identity;

public class JefeAreaId extends Identity {
    public JefeAreaId(String id) {
        super(id);
    }

    public static JefeAreaId of(String id) {
        return new JefeAreaId(id);
    }
}
