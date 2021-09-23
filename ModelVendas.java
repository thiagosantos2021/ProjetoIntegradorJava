package model;

import java.sql.Date;

/**
* @author Thiago 
*/

public class ModelVendas {

    private int id_vendas;
    private int fk_cliente;
    private Date data_venda;
    private double valor_liquido;
    private double valor_bruto;
    private double vendas_desconto;

    /**
    * Construtor
    */
    public ModelVendas(){
    }

    /**
    * seta o valor de id_vendas
    * @param pId_vendas
    */
    public void setId_vendas(int pId_vendas){
        this.id_vendas = pId_vendas;
    }
    /**
    * @return pk_id_vendas
    */
    public int getId_vendas(){
        return this.id_vendas;
    }

    /**
    * seta o valor de fk_cliente
    * @param pFk_cliente
    */
    public void setFk_cliente(int pFk_cliente){
        this.fk_cliente = pFk_cliente;
    }
    /**
    * @return fk_fk_cliente
    */
    public int getFk_cliente(){
        return this.fk_cliente;
    }

    /**
    * seta o valor de data_venda
    * @param pData_venda
    */
    public void setData_venda(Date pData_venda){
        this.data_venda = pData_venda;
    }
    /**
    * @return data_venda
    */
    public Date getData_venda(){
        return this.data_venda;
    }

    /**
    * seta o valor de valor_liquido
    * @param pValor_liquido
    */
    public void setValor_liquido(double pValor_liquido){
        this.valor_liquido = pValor_liquido;
    }
    /**
    * @return valor_liquido
    */
    public double getValor_liquido(){
        return this.valor_liquido;
    }

    /**
    * seta o valor de valor_bruto
    * @param pValor_bruto
    */
    public void setValor_bruto(double pValor_bruto){
        this.valor_bruto = pValor_bruto;
    }
    /**
    * @return valor_bruto
    */
    public double getValor_bruto(){
        return this.valor_bruto;
    }

    /**
    * seta o valor de vendas_desconto
    * @param pVendas_desconto
    */
    public void setVendas_desconto(double pVendas_desconto){
        this.vendas_desconto = pVendas_desconto;
    }
    /**
    * @return vendas_desconto
    */
    public double getVendas_desconto(){
        return this.vendas_desconto;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::id_vendas = " + this.id_vendas + "::fk_cliente = " + this.fk_cliente + "::data_venda = " + this.data_venda + "::valor_liquido = " + this.valor_liquido + "::valor_bruto = " + this.valor_bruto + "::vendas_desconto = " + this.vendas_desconto +  "}";
    }
}