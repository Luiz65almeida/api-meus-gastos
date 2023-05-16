package com.example.api_meus_gastos.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_meus_gastos.domain.model.CentroDeCusto;
import com.example.api_meus_gastos.domain.model.Usuario;

public interface CentroDeCustoRepository extends JpaRepository<CentroDeCusto, Long> {

  List<CentroDeCusto> findByUsuario(Usuario usuario);

}
