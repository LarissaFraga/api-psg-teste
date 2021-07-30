package br.com.testepsg.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter

@Entity
@Table(name = "alternativa")
public class Alternativa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "questao_id", referencedColumnName = "id")
    private Questao questaoId;

    @NotNull
    @Column
    private String descricao;

    @NotNull
    @Column
    private boolean correto;
}
