package co.com.sofkau.epm.mantenimiento.valuesgenericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

    private final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if(this.value.length() > 30){
            throw new IllegalArgumentException("El nombre no permite mas de 30 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
