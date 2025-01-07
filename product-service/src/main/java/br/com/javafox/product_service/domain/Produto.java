package br.com.javafox.product_service.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

@Document(collection = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
    public enum Status {
        ATIVO, INATIVO;
    }

    @Id
    private String id;

    @NotNull
    @Size(min = 2, max = 10)
    @Indexed(unique = true, background = true)
    private String codigo;

    private byte[] imagem;

    @NotNull
    @Size(min = 1, max = 50)
    private String nome;

    private ArrayList<String> benefits;

    @Size(min = 1, max = 50)
    private String descricao;

    private String tipo;

    private BigDecimal valor;

    private Status status;
}
