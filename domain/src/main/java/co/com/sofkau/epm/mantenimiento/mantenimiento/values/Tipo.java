package co.com.sofkau.epm.mantenimiento.mantenimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo  implements ValueObject<String> {
    private final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El municipio no puede estar en blanco");
        }

    }

    @Override
    public String value() {
        return value;
    }
}
