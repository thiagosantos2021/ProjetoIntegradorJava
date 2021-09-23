package model;
/**
*
* @author Thiago 
*/
public class ModelFuncionario {

    private int id_func;
    private String nome_func;
    private String login_func;
    private String senha_func;

    /**
    * Construtor
    */
    public ModelFuncionario(){}

    /**
    * seta o valor de id_func
    * @param pId_func
    */
    public void setId_func(int pId_func){
        this.id_func = pId_func;
    }
    /**
    * @return pk_id_func
    */
    public int getId_func(){
        return this.id_func;
    }

    /**
    * seta o valor de nome_func
    * @param pNome_func
    */
    public void setNome_func(String pNome_func){
        this.nome_func = pNome_func;
    }
    /**
    * @return nome_func
    */
    public String getNome_func(){
        return this.nome_func;
    }

    /**
    * seta o valor de login_func
    * @param pLogin_func
    */
    public void setLogin_func(String pLogin_func){
        this.login_func = pLogin_func;
    }
    /**
    * @return login_func
    */
    public String getLogin_func(){
        return this.login_func;
    }

    /**
    * seta o valor de senha_func
    * @param pSenha_func
    */
    public void setSenha_func(String pSenha_func){
        this.senha_func = pSenha_func;
    }
    /**
    * @return senha_func
    */
    public String getSenha_func(){
        return this.senha_func;
    }

    @Override
    public String toString(){
        return "ModelFuncionario {" + "::id_func = " + this.id_func + "::nome_func = " + this.nome_func + "::login_func = " + this.login_func + "::senha_func = " + this.senha_func +  "}";
    }
}