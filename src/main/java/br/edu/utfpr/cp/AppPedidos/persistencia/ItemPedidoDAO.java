package br.edu.utfpr.cp.AppPedidos.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoDAO extends JpaRepository<ItemPedido, Long> {
    ItemPedido findByQuantidade(int quantidade);
}
