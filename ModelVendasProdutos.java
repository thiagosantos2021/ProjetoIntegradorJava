package model;
/**
*
* @author Thiago 
*/
public class ModelVendasProdutos {

    private int id_vendas_produtos;
    private int fk_produto;
    private int fk_vendas;
    private double valor_vendas_produtos;
    private int vendas_produtos_quantidade;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de id_vendas_produtos
    * @param pId_vendas_produtos
    */
    public void setId_vendas_produtos(int pId_vendas_produtos){
        this.id_vendas_produtos = pId_vendas_produtos;
    }
    /**
    * @return pk_id_vendas_produtos
    */
    public int getId_vendas_produtos(){
        return this.id_vendas_produtos;
    }

    /**
    * seta o valor de fk_produto
    * @param pFk_produto
    */
    public void setFk_produto(int pFk_produto){
        this.fk_produto = pFk_produto;
    }
    /**
    * @return fk_fk_produto
    */
    public int getFk_produto(){
        return this.fk_produto;
    }

    /**
    * seta o valor de fk_vendas
    * @param pFk_vendas
    */
    public void setFk_vendas(int pFk_vendas){
        this.fk_vendas = pFk_vendas;
    }
    /**
    * @return fk_fk_vendas
    */
    public int getFk_vendas(){
        return this.fk_vendas;
    }

    /**
    * seta o valor de valor_vendas_produtos
    * @param pValor_vendas_produtos
    */
    public void setValor_vendas_produtos(double pValor_vendas_produtos){
        this.valor_vendas_produtos = pValor_vendas_produtos;
    }
    /**
    * @return valor_vendas_produtos
    */
    public double getValor_vendas_produtos(){
        return this.valor_vendas_produtos;
    }

    /**
    * seta o valor de valor_vendas_quantidade
    * @param pValor_vendas_quantidade
    */
    public void setVendas_produtos_quantidade(int pVendas_produtos_quantidade){
        this.vendas_produtos_quantidade = pVendas_produtos_quantidade;
    }
    /**
    * @return valor_vendas_quantidade
    */
    public int getVendas_produtos_quantidade(){
        return this.vendas_produtos_quantidade;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::id_vendas_produtos = " + this.id_vendas_produtos + "::fk_produto = " + this.fk_produto + "::fk_vendas = " + this.fk_vendas + "::valor_vendas_produtos = " + this.valor_vendas_produtos + "::valor_vendas_quantidade = " + this.vendas_produtos_quantidade +  "}";
    }
}