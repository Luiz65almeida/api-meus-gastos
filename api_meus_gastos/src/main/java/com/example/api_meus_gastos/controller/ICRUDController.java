package com.example.api_meus_gastos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICRUDController<Req, Res> {

  ResponseEntity<List<Res>> obterTodos();

  ResponseEntity<Res> obterPorId(@PathVariable Long id);

  ResponseEntity<Res> cadastrar(@RequestBody Req dto);

  ResponseEntity<Res> atualizar(@PathVariable Long id, @RequestBody Req dto);

  ResponseEntity<?> deletar(@PathVariable Long id);

}
