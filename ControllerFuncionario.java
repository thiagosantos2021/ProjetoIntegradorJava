package controller;

import model.ModelFuncionario;
import dao.DAOFuncionario;
import java.util.ArrayList;

/**
*
* @author Thiago 
*/
public class ControllerFuncionario {

    private DAOFuncionario daoFuncionario = new DAOFuncionario();

    /**
    * grava Funcionario
    * @param pModelFuncionario
    * @return int
    */
    public int salvarFuncionarioController(ModelFuncionario pModelFuncionario){
        return this.daoFuncionario.salvarFuncionarioDAO(pModelFuncionario);
    }

    /**
    * recupera Funcionario
    * @param pId_func
    * @return ModelFuncionario
    */
    public ModelFuncionario getFuncionarioController(int pId_func){
        return this.daoFuncionario.getFuncionarioDAO(pId_func);
    }
    
    /**
    * recupera Funcionario
    * @param pLogin
    * @return ModelFuncionario
    */
    public ModelFuncionario getFuncionarioController(String pLogin){
        return this.daoFuncionario.getFuncionarioDAO(pLogin);
    }

    /**
    * recupera uma lista deFuncionario
    * @param pId_func
    * @return ArrayList
    */
    public ArrayList<ModelFuncionario> getListaFuncionarioController(){
        return this.daoFuncionario.getListaFuncionarioDAO();
    }

    /**
    * atualiza Funcionario
    * @param pModelFuncionario
    * @return boolean
    */
    public boolean atualizarFuncionarioController(ModelFuncionario pModelFuncionario){
        return this.daoFuncionario.atualizarFuncionarioDAO(pModelFuncionario);
    }

    /**
    * exclui Funcionario
    * @param pId_func
    * @return boolean
    */
    public boolean excluirFuncionarioController(int pId_func){
        return this.daoFuncionario.excluirFuncionarioDAO(pId_func);
    }
    
    //método que valida o login e a senha do funcionario
    public boolean getValidarFuncionarioController(ModelFuncionario pModelFuncionario) {
       return this.daoFuncionario.getValidarFuncionarioDAO(pModelFuncionario);
    }
}