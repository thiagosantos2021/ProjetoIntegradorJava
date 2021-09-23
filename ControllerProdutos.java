package controller;

import dao.DAOProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 * @author Thiago
 */

public class ControllerProdutos {
    private DAOProdutos daoProdutos = new DAOProdutos();
    
    //salvar produtos controller
    public int salvarProdutosController(ModelProdutos modelProdutos){
        return this.daoProdutos.SalvarProdutosDAO(modelProdutos);
    }
    
    //excluir produto pelo código
    public boolean excluirProdutoController(int id_produto){
        return this.daoProdutos.excluirProdutoDAO(id_produto);
    }
    
    //alterar produto
    public boolean alterarProdutoController(ModelProdutos modelProdutos){
        return this.daoProdutos.alterarProdutoDAO(modelProdutos);
    }
    
    //retornar produto pelo código
    public ModelProdutos retornarProdutoController(int id_produto){
        return this.daoProdutos.retornarProdutoDAO(id_produto);
    }
    
    //retornar produto pelo código
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    //retornar uma lista de produtos
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    
    // alterar lista de produtos no banco
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> listaModelProduto) {
        return this.daoProdutos.alterarEstoqueProdutoDAO(listaModelProduto);
    }
}
