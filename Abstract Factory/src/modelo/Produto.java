package modelo;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private int qtd;
    private BigDecimal valorUnitario;

    public double getValorTotal(double imposto){
        BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto));
        valorTotal = valorTotal.multiply(new BigDecimal(qtd));
        return valorTotal.doubleValue();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
