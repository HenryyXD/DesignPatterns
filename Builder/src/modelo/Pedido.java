package modelo;

import java.util.List;

public class Pedido {
    private String numeroPedido;
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    public String getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return this.vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }    

    @Override
    public String toString() {
        return "{" +
            " numeroPedido='" + getNumeroPedido() + "'" +
            ", produtos='" + getProdutos() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", vendedor='" + getVendedor() + "'" +
            "}";
    }
}
