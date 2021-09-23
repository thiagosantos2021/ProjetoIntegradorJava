package model;

/**
 * @author Thiago
 */

public class ModelProdutos {
    
    private int id_produto;
    private String nome_produto;
    private double valor_produto;
    private int estoque_produto;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    public int getEstoque_produto() {
        return estoque_produto;
    }

    public void setEstoque_produto(int estoque_produto) {
        this.estoque_produto = estoque_produto;
    }
}
