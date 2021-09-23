package controller;

import dao.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

/**
 * @author Thiago
 */

public class ControllerProdutosVendasProdutos {
    
    private DAOProdutosVendasProdutos daoProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda){
        return this.daoProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }
    
}
