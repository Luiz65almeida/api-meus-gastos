package com.example.api_meus_gastos.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.api_meus_gastos.common.ConversorData;
import com.example.api_meus_gastos.domain.exception.ResourceBadRequestException;
import com.example.api_meus_gastos.domain.exception.ResourceNotFoundException;
import com.example.api_meus_gastos.domain.model.ErrorResposta;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResposta> haldlerResourceNotFoundException(ResourceNotFoundException exception) {

        String dataHora = ConversorData.converterDateParaDataEHora(new Date());

        ErrorResposta erro = new ErrorResposta(dataHora, HttpStatus.NOT_FOUND.value(), "Not Found",
                exception.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<ErrorResposta> haldlerResourceBadRequestException(ResourceBadRequestException exception) {

        String dataHora = ConversorData.converterDateParaDataEHora(new Date());

        ErrorResposta erro = new ErrorResposta(dataHora, HttpStatus.BAD_REQUEST.value(), "Bad Request",
                exception.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResposta> haldlerRequestException(Exception exception) {

        String dataHora = ConversorData.converterDateParaDataEHora(new Date());

        ErrorResposta erro = new ErrorResposta(dataHora, HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal Server Error",
                exception.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
