
import java.util.*;

public class Produto {

    private String nome;
    private String descricao;
    private double valor;

    public Produto() {
        this.nome = "";
        this.descricao = "";
        this.valor = 0.0;
    }

    public Produto(String nome, String descricao, double valor) {

        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}