package controller;

import model.ModelFormaPagamento;
import DAO.DAOFormaPagamento;
import java.util.ArrayList;

/**
*
* @author Thiago 
*/
public class ControllerFormaPagamento {

    private DAOFormaPagamento daoFormaPagamento = new DAOFormaPagamento();

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.salvarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * recupera FormaPagamento
    * @param pId_forma_pag
    * @return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoController(int pId_forma_pag){
        return this.daoFormaPagamento.getFormaPagamentoDAO(pId_forma_pag);
    }

    /**
    * recupera uma lista deFormaPagamento
    * @param pId_forma_pag
    * @return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoController(){
        return this.daoFormaPagamento.getListaFormaPagamentoDAO();
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * exclui FormaPagamento
    * @param pId_forma_pag
    * @return boolean
    */
    public boolean excluirFormaPagamentoController(int pId_forma_pag){
        return this.daoFormaPagamento.excluirFormaPagamentoDAO(pId_forma_pag);
    }
}