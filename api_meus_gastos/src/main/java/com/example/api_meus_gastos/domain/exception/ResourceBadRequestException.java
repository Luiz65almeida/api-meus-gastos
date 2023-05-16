package com.example.api_meus_gastos.domain.exception;

public class ResourceBadRequestException extends RuntimeException {

    public ResourceBadRequestException(String mensagem) {
        super(mensagem);
    }

}
