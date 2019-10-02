package br.edu.utfpr.cp.AppPedidos.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumidorDAO extends JpaRepository<Consumidor, Long> {
}
