package br.edu.utfpr.cp.AppPedidos.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeDAO extends JpaRepository <Cidade, Long> {
    Cidade findByNome(String nome);
}
