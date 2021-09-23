package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.util.ArrayList;

/**
*
* @author Thiago 
*/
public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pId_vendas
    * @return ModelVendas
    */
    public ModelVendas getVendasController(int pId_vendas){
        return this.daoVendas.getVendasDAO(pId_vendas);
    }

    /**
    * recupera uma lista deVendas
    * @param pId_vendas
    * @return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pId_vendas
    * @return boolean
    */
    public boolean excluirVendasController(int pId_vendas){
        return this.daoVendas.excluirVendasDAO(pId_vendas);
    }
}