package modelo;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private int quantidade;
    private BigDecimal valor;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }

}
