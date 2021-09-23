package model;

/**
* @author Thiago 
*/

public class ModelCliente {

    private int id_cliente;
    private String cli_nome;
    private String cli_endereco;
    private String cli_bairro;
    private String cli_cidade;
    private String cli_uf;
    private String cli_cep;
    private String cli_telefone;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de id_cliente
    * @param pId_cliente
    */
    public void setId_cliente(int pId_cliente){
        this.id_cliente = pId_cliente;
    }
    /**
    * @return pk_id_cliente
    */
    public int getId_cliente(){
        return this.id_cliente;
    }

    /**
    * seta o valor de cli_nome
    * @param pCli_nome
    */
    public void setCli_nome(String pCli_nome){
        this.cli_nome = pCli_nome;
    }
    /**
    * @return cli_nome
    */
    public String getCli_nome(){
        return this.cli_nome;
    }

    /**
    * seta o valor de cli_endereco
    * @param pCli_endereco
    */
    public void setCli_endereco(String pCli_endereco){
        this.cli_endereco = pCli_endereco;
    }
    /**
    * @return cli_endereco
    */
    public String getCli_endereco(){
        return this.cli_endereco;
    }

    /**
    * seta o valor de cli_bairro
    * @param pCli_bairro
    */
    public void setCli_bairro(String pCli_bairro){
        this.cli_bairro = pCli_bairro;
    }
    /**
    * @return cli_bairro
    */
    public String getCli_bairro(){
        return this.cli_bairro;
    }

    /**
    * seta o valor de cli_cidade
    * @param pCli_cidade
    */
    public void setCli_cidade(String pCli_cidade){
        this.cli_cidade = pCli_cidade;
    }
    /**
    * @return cli_cidade
    */
    public String getCli_cidade(){
        return this.cli_cidade;
    }

    /**
    * seta o valor de cli_uf
    * @param pCli_uf
    */
    public void setCli_uf(String pCli_uf){
        this.cli_uf = pCli_uf;
    }
    /**
    * @return cli_uf
    */
    public String getCli_uf(){
        return this.cli_uf;
    }

    /**
    * seta o valor de cli_cep
    * @param pCli_cep
    */
    public void setCli_cep(String pCli_cep){
        this.cli_cep = pCli_cep;
    }
    /**
    * @return cli_cep
    */
    public String getCli_cep(){
        return this.cli_cep;
    }

    /**
    * seta o valor de cli_telefone
    * @param pCli_telefone
    */
    public void setCli_telefone(String pCli_telefone){
        this.cli_telefone = pCli_telefone;
    }
    /**
    * @return cli_telefone
    */
    public String getCli_telefone(){
        return this.cli_telefone;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::id_cliente = " + this.id_cliente + "::cli_nome = " + this.cli_nome + "::cli_endereco = " + this.cli_endereco + "::cli_bairro = " + this.cli_bairro + "::cli_cidade = " + this.cli_cidade + "::cli_uf = " + this.cli_uf + "::cli_cep = " + this.cli_cep + "::cli_telefone = " + this.cli_telefone +  "}";
    }
}