package br.edu.utfpr.cp.AppPedidos.persistencia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Pedido implements Serializable {

    @Id @GeneratedValue
    private long id;
    private double total;
    @ManyToOne
    private Consumidor consumidor;
    @ManyToOne
    private ItemPedido itemPedido;

}
