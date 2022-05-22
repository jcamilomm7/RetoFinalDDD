package co.com.sofkau.epm.mantenimiento.mantenimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PlanillaMantenimiento implements ValueObject<String> {
    private final String value;

    public PlanillaMantenimiento(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La planilla no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
