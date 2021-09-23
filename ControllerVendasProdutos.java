package controller;

import model.ModelVendasProdutos;
import DAO.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Thiago 
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pId_vendas_produtos
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pId_vendas_produtos){
        return this.daoVendasProdutos.getVendasProdutosDAO(pId_vendas_produtos);
    }

    /**
    * recupera uma lista de VendasProdutos
    * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pfk_vendas
    * @return boolean
    */
    public boolean excluirVendasProdutosController(int pfk_vendas){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pfk_vendas);
    }

    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
        return this.daoVendasProdutos.SalvarVendasProdutosDAO(plistaModelVendasProdutos);
    }
}