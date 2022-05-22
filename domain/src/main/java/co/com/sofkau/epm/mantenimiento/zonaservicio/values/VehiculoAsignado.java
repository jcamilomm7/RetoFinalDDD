package co.com.sofkau.epm.mantenimiento.zonaservicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class VehiculoAsignado implements ValueObject<String> {

    private final String value;

    public VehiculoAsignado(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
