package br.edu.utfpr.cp.AppPedidos.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDAO extends JpaRepository<Estado, Long> {
    Estado findByNome(String nome);
}
