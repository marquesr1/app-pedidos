package br.edu.utfpr.cp.AppPedidos;

import br.edu.utfpr.cp.AppPedidos.persistencia.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppPedidosApplication implements CommandLineRunner {

	private final CidadeDAO cidadeDAO;
	private final ConsumidorDAO consumidorDAO;
	private final EstadoDAO estadoDAO;
	private final ItemPedidoDAO itemPedidoDAO;
	private final PedidoDAO pedidoDAO;
	private final ProdutoDAO produtoDAO;


	public AppPedidosApplication(CidadeDAO cidadeDAO, ConsumidorDAO consumidorDAO, EstadoDAO estadoDAO, ItemPedidoDAO itemPedidoDAO, PedidoDAO pedidoDAO, ProdutoDAO produtoDAO) {
		this.cidadeDAO = cidadeDAO;
		this.consumidorDAO = consumidorDAO;
		this.estadoDAO = estadoDAO;
		this.itemPedidoDAO = itemPedidoDAO;
		this.pedidoDAO = pedidoDAO;
		this.produtoDAO = produtoDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppPedidosApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		estadoDAO.save(Estado.builder().nome("Parana").build());

		var estado = estadoDAO.findByNome("Parana");

		cidadeDAO.save(Cidade.builder().nome("Londrina").estado(estado).build());

		var cidade = cidadeDAO.findByNome("Londrina");

		consumidorDAO.save(Consumidor.builder().nome("Gabriel").telefone("999-999-999").cidade(cidade).build());

		var consumidor = consumidorDAO.findByNome("Gabriel");


		produtoDAO.save(Produto.builder().nome("Whey Protein").preco(54.90).build());

		var produto = produtoDAO.findByNome("Whey Protein");

		itemPedidoDAO.save(ItemPedido.builder().quantidade(2).produto(produto).build());

		var itemPedido = itemPedidoDAO.findByQuantidade(2);


		pedidoDAO.save(Pedido.builder().total(109.80).consumidor(consumidor).itemPedido(itemPedido).build());

		produtoDAO.findAll().forEach(System.out::println);
		itemPedidoDAO.findAll().forEach(System.out::println);

		estadoDAO.findAll().forEach(System.out::println);
		cidadeDAO.findAll().forEach(System.out::println);
		consumidorDAO.findAll().forEach(System.out::println);

		pedidoDAO.findAll().forEach(System.out::println);


	}

}
