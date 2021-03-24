package modelo;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }

}
