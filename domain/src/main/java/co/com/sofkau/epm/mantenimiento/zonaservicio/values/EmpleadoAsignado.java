package co.com.sofkau.epm.mantenimiento.zonaservicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EmpleadoAsignado implements ValueObject<String> {

    private final String value;

    public EmpleadoAsignado(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
