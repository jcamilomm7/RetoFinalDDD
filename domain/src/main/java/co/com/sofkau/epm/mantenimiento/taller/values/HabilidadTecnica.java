package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HabilidadTecnica implements ValueObject<String> {

    private final String value;
    public HabilidadTecnica(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("no puede estar en blanco");
        }

        if(this.value.length() > 60){
            throw new IllegalArgumentException("no permite mas de 60 caracteres, resuma");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
