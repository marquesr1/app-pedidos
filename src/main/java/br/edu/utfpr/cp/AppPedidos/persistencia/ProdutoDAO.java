package br.edu.utfpr.cp.AppPedidos.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoDAO extends JpaRepository<Produto, Long> {
}
