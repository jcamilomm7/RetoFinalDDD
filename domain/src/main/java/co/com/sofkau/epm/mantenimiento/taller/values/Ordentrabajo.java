package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ordentrabajo implements ValueObject<String> {

    private final String value;
    public Ordentrabajo(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("no puede estar en blanco");
        }

        if(this.value.length() > 200){
            throw new IllegalArgumentException("no permite mas de 200 caracteres,resuma");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
