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
public class Consumidor implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String telefone;
    @ManyToOne
    private Cidade cidade;
}
