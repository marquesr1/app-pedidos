package br.edu.utfpr.cp.AppPedidos.persistencia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Cidade implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    @ManyToOne
    private Estado estado;
}
