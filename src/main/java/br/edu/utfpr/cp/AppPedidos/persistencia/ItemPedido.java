package br.edu.utfpr.cp.AppPedidos.persistencia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class ItemPedido implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private int quantidade;
    @ManyToOne
    private Produto produto;
}
