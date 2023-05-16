package com.example.api_meus_gastos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_meus_gastos.domain.service.TituloService;
import com.example.api_meus_gastos.dto.titulos.TituloRequestDto;
import com.example.api_meus_gastos.dto.titulos.TituloResponseDto;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/titulos")
public class TituloController implements ICRUDController<TituloRequestDto, TituloResponseDto> {

  @Autowired
  private TituloService tituloService;

  @GetMapping
  @Override
  public ResponseEntity<List<TituloResponseDto>> obterTodos() {

    return ResponseEntity.ok(tituloService.obterTodos());

  }

  @GetMapping("/{id}")
  @Override
  public ResponseEntity<TituloResponseDto> obterPorId(Long id) {

    return ResponseEntity.ok(tituloService.obterPorId(id));

  }

  @Override
  public ResponseEntity<TituloResponseDto> cadastrar(TituloRequestDto dto) {

    TituloResponseDto titulo = tituloService.cadastrar(dto);

    return new ResponseEntity<>(titulo, HttpStatus.CREATED);

  }

  @Override
  public ResponseEntity<TituloResponseDto> atualizar(Long id, TituloRequestDto dto) {

    return ResponseEntity.ok(tituloService.atualizar(id, dto));

  }

  @Override
  public ResponseEntity<?> deletar(Long id) {

    tituloService.deletar(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);

  }

}
