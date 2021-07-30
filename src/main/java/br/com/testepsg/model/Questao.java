package br.com.testepsg.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter

@Entity
@Table(name = "questao")
public class Questao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column
    private int numero;

    @NotNull
    @Column
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tipo_questao_id", referencedColumnName = "id")
    private TipoQuestao tipoQuestaoId;

    @NotNull
    @Column
    private int obrigatoriedade;

    @NotNull
    @Column
    private int situacao;

    @Column(name = "min_alternativa")
    private int minAlternativa;
}
