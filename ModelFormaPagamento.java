package model;

/**
* @author Thiago 
*/

public class ModelFormaPagamento {

    private int id_forma_pagamento;
    private String descricao_forma_pag;
    private float desconto_forma_pag;
    private int quant_parcelas;
    private int situacao;

    /**
    * Construtor
    */
    
    public ModelFormaPagamento(){}

    /**
    * seta o valor de id_forma_pag
    * @param pId_forma_pag
    */
    public void setId_forma_pag(int pId_forma_pag){
        this.id_forma_pagamento = pId_forma_pag;
    }
    
    /**
    * @return id_forma_pag
    */
    public int getId_forma_pag(){
        return this.id_forma_pagamento;
    }

    /**
    * seta o valor de descricao_forma_pag
    * @param pDescricao_forma_pag
    */
    public void setDescricao_forma_pag(String pDescricao_forma_pag){
        this.descricao_forma_pag = pDescricao_forma_pag;
    }
    
    /**
    * @return descricao_forma_pag
    */
    public String getDescricao_forma_pag(){
        return this.descricao_forma_pag;
    }

    /**
    * seta o valor de desconto_forma_pag
    * @param pDesconto_forma_pag
    */
    public void setDesconto_forma_pag(float pDesconto_forma_pag){
        this.desconto_forma_pag = pDesconto_forma_pag;
    }
    
    /**
    * @return desconto_forma_pag
    */
    public float getDesconto_forma_pag(){
        return this.desconto_forma_pag;
    }

    /**
    * seta o valor de parcelas_forma_pag
    * @param pParcelas_forma_pag
    */
    public void setParcelas_forma_pag(int pParcelas_forma_pag){
        this.quant_parcelas = pParcelas_forma_pag;
    }
    
    /**
    * @return parcelas_forma_pag
    */
    public int getParcelas_forma_pag(){
        return this.quant_parcelas;
    }

    /**
    * seta o valor de situacao_forma_pag
    * @param pSituacao_forma_pag
    */
    public void setSituacao_forma_pag(int pSituacao_forma_pag){
        this.situacao = pSituacao_forma_pag;
    }
    
    /**
    * @return situacao_forma_pag
    */
    public int getSituacao_forma_pag(){
        return this.situacao;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::id_forma_pag = " + this.id_forma_pagamento + "::descricao_forma_pag = " + this.descricao_forma_pag + "::desconto_forma_pag = " + this.desconto_forma_pag + "::parcelas_forma_pag = " + this.quant_parcelas + "::situacao_forma_pag = " + this.situacao +  "}";
    }
}