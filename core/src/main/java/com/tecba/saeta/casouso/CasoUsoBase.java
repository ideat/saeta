package com.tecba.saeta.casouso;

import com.tecba.saeta.excepcion.CasoUsoExcepcion;

import javax.validation.*;
import java.util.Optional;
import java.util.Set;

public abstract class CasoUsoBase<R> implements CasoUso<R> {
    private static ValidatorFactory validatorFactory;
    private static Validator validator;

    protected Optional<R> searchByNaturalKey;
    protected Optional<R> searchById;

    static {
        validatorFactory = Validation.buildDefaultValidatorFactory();

        validator = validatorFactory.getValidator();
    }

    @Override
    public void ejecutar(){
        this.searchByNaturalKey = this.getByNaturalKey();
        this.searchById = this.getById();

        if (this.searchByNaturalKey.isPresent() && isTheSameEntity(this.searchById,this.searchByNaturalKey)){
            throw new CasoUsoExcepcion(getMessageError());
        }
    }

    private boolean isTheSameEntity(Optional<R> searchById, Optional<R> searchByNaturalKey){
        return searchById.isPresent() && searchByNaturalKey.get().equals(searchById.get());
    }

    protected abstract Optional<R> getById();
    protected abstract Optional<R> getByNaturalKey();
    protected abstract String getMessageError();

    protected void validateBean(Object bean){
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(bean);

        if (!constraintViolations.isEmpty()){
            throw new ValidationException(constraintViolations.iterator().next().getMessage());
        }
    }


}
