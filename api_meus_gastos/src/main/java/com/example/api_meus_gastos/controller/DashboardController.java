package com.example.api_meus_gastos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_meus_gastos.domain.service.DashboardService;
import com.example.api_meus_gastos.dto.dashboard.DashboardResponseDto;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

  @Autowired
  private DashboardService dashboardService;

  @GetMapping
  public ResponseEntity<DashboardResponseDto> obterFluxoDeCaixa(
      @RequestParam(name = "periodoInicial") String periodoInicial,
      @RequestParam(name = "periodoFinal") String periodoFinal) {
    return ResponseEntity.ok(dashboardService.obterFluxoDeCaixa(periodoInicial, periodoFinal));
  }

}
